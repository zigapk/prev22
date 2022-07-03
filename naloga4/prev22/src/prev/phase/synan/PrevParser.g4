parser grammar PrevParser;

@header {

	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	import prev.data.ast.tree.*;
	import prev.data.ast.tree.decl.*;
	import prev.data.ast.tree.expr.*;
	import prev.data.ast.tree.stmt.*;
	import prev.data.ast.tree.type.*;
	
}

@members {

	private Location loc(Token tok) { return new Location((prev.data.sym.Token) tok); }
    private Location loc(Locatable loc) { return new Location(loc); }
    private Location loc(Token tok1, Token tok2) { return new Location((prev.data.sym.Token) tok1, (prev.data.sym.Token) tok2); }
    private Location loc(Token tok1, Locatable loc2) { return new Location((prev.data.sym.Token) tok1, loc2); }
    private Location loc(Locatable loc1, Token tok2) { return new Location(loc1, (prev.data.sym.Token) tok2); }
    private Location loc(Locatable loc1, Locatable loc2) { return new Location(loc1, loc2); }

}

options{
    tokenVocab=PrevLexer;
}

source returns [AstTrees<AstDecl> ast]:
	{ Vector<AstDecl> res = new Vector<AstDecl>(); }
	(decl { res.add($decl.ast); } )+
	{ $ast = new AstTrees<AstDecl>(res);}
	 EOF
	 ;

decl returns [AstDecl ast]:	decl_type { $ast = $decl_type.ast; } |
							decl_var { $ast = $decl_var.ast; } |
							decl_fun { $ast = $decl_fun.ast; };
decl_type returns [AstDecl ast]: KWORD_TYP IDENTIFIER SYM_SET type { $ast = new AstTypeDecl(loc($KWORD_TYP, $type.ast), $IDENTIFIER.text, $type.ast); };
decl_var returns [AstDecl ast]: KWORD_VAR IDENTIFIER SYM_COLON type { $ast = new AstVarDecl(loc($KWORD_VAR, $type.ast), $IDENTIFIER.text, $type.ast); };

decl_fun returns [AstDecl ast]:
							KWORD_FUN IDENTIFIER
							{ Vector<AstParDecl> args = new Vector<AstParDecl>(); }
							{ String name = $IDENTIFIER.text; }
							SYM_LEFT_BRACE (
								(IDENTIFIER SYM_COLON type) { args.add(new AstParDecl(loc($IDENTIFIER, $type.ast), $IDENTIFIER.text, $type.ast)); }
								(
									SYM_COMMA (IDENTIFIER SYM_COLON type) { args.add(new AstParDecl(loc($IDENTIFIER, $type.ast), $IDENTIFIER.text, $type.ast)); }
								)*
							)? SYM_RIGHT_BRACE
							SYM_COLON type { Location l = loc($KWORD_FUN, $type.ast); AstExpr astExpr = null; }
							(
								SYM_SET expr
								{ l = loc($KWORD_FUN, $expr.ast); }
								{ astExpr = $expr.ast; }
							)? { $ast = new AstFunDecl(l, name, new AstTrees<AstParDecl>(args), $type.ast, astExpr); };

type returns [AstType ast]:
							type_atomic { $ast = $type_atomic.ast; } |
							type_named { $ast = $type_named.ast; } |
							type_array { $ast = $type_array.ast; } |
							type_pointer { $ast = $type_pointer.ast; } |
							type_record { $ast = $type_record.ast; } |
							type_enclosed { $ast = $type_enclosed.ast; }
							;


type_atomic  returns [AstType ast]: KWORD_VOID { $ast = new AstAtomType(loc($KWORD_VOID), AstAtomType.Type.VOID); } |
									KWORD_CHAR { $ast = new AstAtomType(loc($KWORD_CHAR), AstAtomType.Type.CHAR); } |
									KWORD_INT { $ast = new AstAtomType(loc($KWORD_INT), AstAtomType.Type.INT); } |
									KWORD_BOOL { $ast = new AstAtomType(loc($KWORD_BOOL), AstAtomType.Type.BOOL); }
									;
type_named returns [AstType ast]: IDENTIFIER { $ast = new AstNameType(loc($IDENTIFIER), $IDENTIFIER.text); } ;
type_array returns [AstType ast]: SYM_LEFT_BRACKET expr SYM_RIGHT_BRACKET type { $ast = new AstArrType(loc($SYM_LEFT_BRACKET, $type.ast), $type.ast, $expr.ast); };
type_pointer returns [AstType ast]: SYM_POW type { $ast = new AstPtrType(loc($SYM_POW, $type.ast), $type.ast); } ;
type_record returns [AstType ast]: SYM_LEFT_CURLY_BRACE
									{ Vector<AstCompDecl> d = new Vector<AstCompDecl>(); }
									IDENTIFIER SYM_COLON type {}
									{ d.add(new AstCompDecl(loc($IDENTIFIER, $type.ast), $IDENTIFIER.text, $type.ast)); }
									(SYM_COMMA IDENTIFIER SYM_COLON type {d.add(new AstCompDecl(loc($IDENTIFIER, $type.ast), $IDENTIFIER.text, $type.ast)); } )*
									SYM_RIGHT_CURLY_BRACE
									{ $ast = new AstRecType(loc($SYM_LEFT_CURLY_BRACE, $SYM_RIGHT_CURLY_BRACE), new AstTrees<AstCompDecl>(d)); }
									;
type_enclosed returns [AstType ast]: SYM_LEFT_BRACE type SYM_RIGHT_BRACE
									{ $ast = $type.ast; }
                             		{ $ast.relocate(loc($SYM_LEFT_BRACE, $SYM_RIGHT_BRACE)); }
									;

expr returns [AstExpr ast]:
							expr_const { $ast = $expr_const.ast; } |
							expr_var_access { $ast = $expr_var_access.ast; } |
							expr_fun_call { $ast = $expr_fun_call.ast; } |
							expr_alloc { $ast = $expr_alloc.ast; } |
							expr_compound { $ast = $expr_compound.ast; } |
							expr_typecast { $ast = $expr_typecast.ast; } |
							expr_enclosed { $ast = $expr_enclosed.ast; } |

							// postfix array
							ex1=expr SYM_LEFT_BRACKET ex2=expr SYM_RIGHT_BRACKET { $ast = new AstArrExpr(loc($ex1.ast, $SYM_RIGHT_BRACKET), $ex1.ast, $ex2.ast); } |
							// postfix pointer
							e=expr SYM_POW { $ast = new AstSfxExpr(loc($e.ast, $SYM_POW), AstSfxExpr.Oper.PTR, $e.ast); } |
							// postfix record
							e=expr SYM_DOT IDENTIFIER { $ast = new AstRecExpr(loc($e.ast, $IDENTIFIER), $e.ast, new AstNameExpr(loc($IDENTIFIER), $IDENTIFIER.text)); } |

							expr_prefix { $ast = $expr_prefix.ast; } |
							ex1=expr expr_infix_mul ex2=expr { $ast = new AstBinExpr(loc($ex1.ast, $ex2.ast), $expr_infix_mul.o, $ex1.ast, $ex2.ast); } |
							ex1=expr expr_infix_add ex2=expr { $ast = new AstBinExpr(loc($ex1.ast, $ex2.ast), $expr_infix_add.o, $ex1.ast, $ex2.ast); } |
							ex1=expr expr_infix_rel ex2=expr { $ast = new AstBinExpr(loc($ex1.ast, $ex2.ast), $expr_infix_rel.o, $ex1.ast, $ex2.ast); } |

							e1=expr expr_infix_and e2=expr { $ast = new AstBinExpr(loc($e1.ast, $e2.ast), AstBinExpr.Oper.AND, $e1.ast, $e2.ast); } |

							e1=expr expr_infix_or e2=expr { $ast = new AstBinExpr(loc($e1.ast, $e2.ast), AstBinExpr.Oper.OR, $e1.ast, $e2.ast); } |

							e=expr KWORD_WHERE SYM_LEFT_CURLY_BRACE
							{ Vector<AstDecl> d = new Vector<AstDecl>(); }
							decl { d.add($decl.ast); }
							(decl { d.add($decl.ast); } )*
							SYM_RIGHT_CURLY_BRACE
							{ $ast = new AstWhereExpr(loc($e.ast, $SYM_RIGHT_CURLY_BRACE), $e.ast, new AstTrees<AstDecl>(d)); }
							;
expr_const returns [AstExpr ast]:
							c=CONST_VOID { $ast = new AstAtomExpr(loc($c), AstAtomExpr.Type.POINTER, $c.getText()); } |
							c=CONST_BOOL { $ast = new AstAtomExpr(loc($c), AstAtomExpr.Type.BOOL, $c.getText()); } |
							c=CONST_INT { $ast = new AstAtomExpr(loc($c), AstAtomExpr.Type.INT, $c.getText()); } |
							c=CONST_CHAR { $ast = new AstAtomExpr(loc($c), AstAtomExpr.Type.CHAR, $c.getText()); } |
							c=CONST_STR { $ast = new AstAtomExpr(loc($c), AstAtomExpr.Type.STRING, $c.getText()); }
							;
expr_var_access returns [AstNameExpr ast]: IDENTIFIER { $ast = new AstNameExpr(loc($IDENTIFIER), $IDENTIFIER.text); };
expr_fun_call returns [AstExpr ast]: 		IDENTIFIER SYM_LEFT_BRACE
											{ Vector<AstExpr> e = new Vector<AstExpr>(); }
											(
												expr { e.add($expr.ast); }
												(SYM_COMMA expr { e.add($expr.ast); })*
											)? SYM_RIGHT_BRACE
											{ $ast = new AstCallExpr(loc($IDENTIFIER, $SYM_RIGHT_BRACE), $IDENTIFIER.text, new AstTrees<AstExpr>(e));}
											;
expr_alloc returns [AstExpr ast]: 			{ AstPfxExpr.Oper o = null; Location l = null;}
											(
												KWORD_NEW { o = AstPfxExpr.Oper.NEW; l = loc($KWORD_NEW); } |
												KWORD_DEL { o = AstPfxExpr.Oper.DEL; l = loc($KWORD_DEL); }
											)
											expr { $ast = new AstPfxExpr(loc(l, $expr.ast.location()), o, $expr.ast); }
											;
expr_compound returns [AstExpr ast]: 		SYM_LEFT_CURLY_BRACE
											{ Vector<AstStmt> statements = new Vector<AstStmt>();}
											stmt { statements.add($stmt.ast); }
											SYM_SEMICOLON (
											stmt SYM_SEMICOLON { statements.add($stmt.ast); }
											)* SYM_RIGHT_CURLY_BRACE
											{ $ast = new AstStmtExpr(loc($SYM_LEFT_CURLY_BRACE, $SYM_RIGHT_CURLY_BRACE), new AstTrees<AstStmt>(statements)); }
											;
expr_typecast returns [AstExpr ast]: SYM_LEFT_BRACE expr SYM_COLON type SYM_RIGHT_BRACE { $ast = new AstCastExpr(loc($SYM_LEFT_BRACE, $SYM_RIGHT_BRACE), $expr.ast, $type.ast) ; };
expr_enclosed returns [AstExpr ast]: SYM_LEFT_BRACE expr SYM_RIGHT_BRACE { $ast = $expr.ast; $ast.relocate(loc($SYM_LEFT_BRACE, $SYM_RIGHT_BRACE)); };
expr_infix_mul returns [AstBinExpr.Oper o]: SYM_MUL { $o = AstBinExpr.Oper.MUL; } |
											SYM_DIV { $o = AstBinExpr.Oper.DIV; } |
											SYM_MOD { $o = AstBinExpr.Oper.MOD; };
expr_infix_add returns [AstBinExpr.Oper o]: SYM_PLUS { $o = AstBinExpr.Oper.ADD; } |
											SYM_MINUS { $o = AstBinExpr.Oper.SUB; };
expr_infix_rel returns [AstBinExpr.Oper o]: SYM_EQU { $o = AstBinExpr.Oper.EQU; } |
											SYM_NEQ { $o = AstBinExpr.Oper.NEQ; } |
											SYM_LS { $o = AstBinExpr.Oper.LTH; } |
											SYM_GT { $o = AstBinExpr.Oper.GTH; } |
											SYM_LSE { $o = AstBinExpr.Oper.LEQ; } |
											SYM_GTE { $o = AstBinExpr.Oper.GEQ; };
expr_infix_and: SYM_AND;
expr_infix_or: SYM_OR;
expr_prefix returns [AstExpr ast]: { AstPfxExpr.Oper o = null; Location l = null; }
									(
										SYM_NOT { o = AstPfxExpr.Oper.NOT; l = loc($SYM_NOT); } |
										SYM_PLUS { o = AstPfxExpr.Oper.ADD; l = loc($SYM_PLUS); } |
										SYM_MINUS { o = AstPfxExpr.Oper.SUB; l = loc($SYM_MINUS); } |
										SYM_POW { o = AstPfxExpr.Oper.PTR; l = loc($SYM_POW); }
									)
									expr { $ast = new AstPfxExpr(loc(l, $expr.ast.location()), o, $expr.ast) ;};


stmt returns [AstStmt ast]: stmt_expr { $ast = $stmt_expr.ast; } |
							stmt_assign { $ast = $stmt_assign.ast; } |
							stmt_cond { $ast = $stmt_cond.ast; } |
							stmt_loop { $ast = $stmt_loop.ast; }
							;
stmt_expr returns [AstStmt ast]: expr
							{
								$ast = new AstExprStmt(loc($expr.ast), $expr.ast);
							};
stmt_assign returns [AstStmt ast]: ex1=expr SYM_SET ex2=expr { $ast = new AstAssignStmt(loc($ex1.ast, $ex2.ast), $ex1.ast, $ex2.ast); };
stmt_cond returns [AstStmt ast]: ifE=KWORD_IF expr KWORD_THEN thenSt=stmt KWORD_ELSE elseSt=stmt
							{
								Location loc = loc(loc($ifE), $elseSt.ast);
								$ast = new AstIfStmt(loc, $expr.ast, $thenSt.ast, $elseSt.ast);
							};
stmt_loop  returns [AstStmt ast]: whileE=KWORD_WHILE expr KWORD_DO stmt
							{
								Location loc = loc(loc($whileE), $stmt.ast);
								$ast = new AstWhileStmt(loc, $expr.ast, $stmt.ast);
							};