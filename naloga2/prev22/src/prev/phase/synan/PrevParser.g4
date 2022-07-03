parser grammar PrevParser;

@header {

	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	//import prev.data.ast.tree.*;
	//import prev.data.ast.tree.decl.*;
	//import prev.data.ast.tree.expr.*;
	//import prev.data.ast.tree.stmt.*;
	//import prev.data.ast.tree.type.*;
	import prev.phase.lexan.*;
	
}

@members {

	private Location loc(Token     tok) { return new Location((prev.data.sym.Token)tok); }
	private Location loc(Locatable loc) { return new Location(loc                 ); }
	private Location loc(Token     tok1, Token     tok2) { return new Location((prev.data.sym.Token)tok1, (prev.data.sym.Token)tok2); }
	private Location loc(Token     tok1, Locatable loc2) { return new Location((prev.data.sym.Token)tok1, loc2); }
	private Location loc(Locatable loc1, Token     tok2) { return new Location(loc1,                      (prev.data.sym.Token)tok2); }
	private Location loc(Locatable loc1, Locatable loc2) { return new Location(loc1,                      loc2); }

}

options{
    tokenVocab=PrevLexer;
}


source: decl decl* EOF;

decl: decl_type | decl_var | decl_fun;
decl_type: KWORD_TYP IDENTIFIER SYM_SET type;
decl_var: KWORD_VAR IDENTIFIER SYM_COLON type;
//                                                      fun identifier ( [ identifier : type { , identifier : type } ] ) : type [ = expr ]
decl_fun: KWORD_FUN IDENTIFIER SYM_LEFT_BRACE decl_fun_args SYM_RIGHT_BRACE SYM_COLON type (SYM_SET expr)?;
decl_fun_args: (decl_fun_arg (SYM_COMMA decl_fun_arg)*)?;
decl_fun_arg: IDENTIFIER SYM_COLON type;

type: type_atomic | type_named | type_array | type_pointer | type_record | type_enclosed;
type_atomic: KWORD_VOID | KWORD_CHAR | KWORD_INT | KWORD_BOOL;
type_named: IDENTIFIER;
type_array: SYM_LEFT_BRACKET expr SYM_RIGHT_BRACKET type;
type_pointer: SYM_POW type;
type_record: SYM_LEFT_CURLY_BRACE record_atom (SYM_COMMA record_atom)* SYM_RIGHT_CURLY_BRACE;
type_enclosed: SYM_LEFT_BRACE type SYM_RIGHT_BRACE;

record_atom: IDENTIFIER SYM_COLON type;

expr: expr_const | expr_var_access | expr_fun_call | expr_alloc | expr_compound | expr_typecast | expr_enclosed | expr expr_postfix | expr_prefix | expr expr_infix_mul expr | expr expr_infix_add expr | expr expr_infix_rel expr | expr expr_infix_and expr | expr expr_infix_or expr | expr expr_where;
expr_const: CONST_VOID | CONST_BOOL | CONST_INT | CONST_CHAR | CONST_STR;
expr_var_access: IDENTIFIER;
expr_fun_call: IDENTIFIER SYM_LEFT_BRACE (expr (SYM_COMMA expr)*)? SYM_RIGHT_BRACE;
expr_alloc: (KWORD_NEW | KWORD_DEL) expr;
expr_compound: SYM_LEFT_CURLY_BRACE stmt SYM_SEMICOLON (stmt SYM_SEMICOLON)* SYM_RIGHT_CURLY_BRACE;
expr_typecast: SYM_LEFT_BRACE expr SYM_COLON type SYM_RIGHT_BRACE;
expr_enclosed: SYM_LEFT_BRACE expr SYM_RIGHT_BRACE;
expr_infix_mul: SYM_MUL|SYM_DIV|SYM_MOD;
expr_infix_add: SYM_PLUS|SYM_MINUS|SYM_EQU|SYM_NEQ|SYM_LS|SYM_GT|SYM_LSE|SYM_GTE| SYM_AND|SYM_OR;
expr_infix_rel: SYM_EQU|SYM_NEQ|SYM_LS|SYM_GT|SYM_LSE|SYM_GTE;
expr_infix_and: SYM_AND;
expr_infix_or: SYM_OR;
expr_prefix: (SYM_NOT|SYM_PLUS|SYM_MINUS|SYM_POW) expr;
expr_postfix: SYM_LEFT_BRACKET expr SYM_RIGHT_BRACKET | SYM_POW | SYM_DOT IDENTIFIER;
expr_where: KWORD_WHERE SYM_LEFT_CURLY_BRACE decl (decl)* SYM_RIGHT_CURLY_BRACE;


stmt: stmt_expr | stmt_assign | stmt_cond | stmt_loop;
stmt_expr: expr;
stmt_assign: expr SYM_SET expr;
stmt_cond: KWORD_IF expr KWORD_THEN stmt KWORD_ELSE stmt;
stmt_loop: KWORD_WHILE expr KWORD_DO stmt;