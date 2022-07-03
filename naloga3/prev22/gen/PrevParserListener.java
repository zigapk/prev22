// Generated from /Users/zigapk/University/prev/naloga3/prev22/src/prev/phase/synan/PrevParser.g4 by ANTLR 4.9.2


	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	import prev.data.ast.tree.*;
	import prev.data.ast.tree.decl.*;
	import prev.data.ast.tree.expr.*;
	import prev.data.ast.tree.stmt.*;
	import prev.data.ast.tree.type.*;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrevParser}.
 */
public interface PrevParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrevParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(PrevParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(PrevParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PrevParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PrevParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#decl_type}.
	 * @param ctx the parse tree
	 */
	void enterDecl_type(PrevParser.Decl_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#decl_type}.
	 * @param ctx the parse tree
	 */
	void exitDecl_type(PrevParser.Decl_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var(PrevParser.Decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var(PrevParser.Decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#decl_fun}.
	 * @param ctx the parse tree
	 */
	void enterDecl_fun(PrevParser.Decl_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#decl_fun}.
	 * @param ctx the parse tree
	 */
	void exitDecl_fun(PrevParser.Decl_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PrevParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PrevParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_atomic}.
	 * @param ctx the parse tree
	 */
	void enterType_atomic(PrevParser.Type_atomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_atomic}.
	 * @param ctx the parse tree
	 */
	void exitType_atomic(PrevParser.Type_atomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_named}.
	 * @param ctx the parse tree
	 */
	void enterType_named(PrevParser.Type_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_named}.
	 * @param ctx the parse tree
	 */
	void exitType_named(PrevParser.Type_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_array}.
	 * @param ctx the parse tree
	 */
	void enterType_array(PrevParser.Type_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_array}.
	 * @param ctx the parse tree
	 */
	void exitType_array(PrevParser.Type_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_pointer}.
	 * @param ctx the parse tree
	 */
	void enterType_pointer(PrevParser.Type_pointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_pointer}.
	 * @param ctx the parse tree
	 */
	void exitType_pointer(PrevParser.Type_pointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_record}.
	 * @param ctx the parse tree
	 */
	void enterType_record(PrevParser.Type_recordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_record}.
	 * @param ctx the parse tree
	 */
	void exitType_record(PrevParser.Type_recordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#type_enclosed}.
	 * @param ctx the parse tree
	 */
	void enterType_enclosed(PrevParser.Type_enclosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#type_enclosed}.
	 * @param ctx the parse tree
	 */
	void exitType_enclosed(PrevParser.Type_enclosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PrevParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PrevParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_const}.
	 * @param ctx the parse tree
	 */
	void enterExpr_const(PrevParser.Expr_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_const}.
	 * @param ctx the parse tree
	 */
	void exitExpr_const(PrevParser.Expr_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_var_access}.
	 * @param ctx the parse tree
	 */
	void enterExpr_var_access(PrevParser.Expr_var_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_var_access}.
	 * @param ctx the parse tree
	 */
	void exitExpr_var_access(PrevParser.Expr_var_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_fun_call}.
	 * @param ctx the parse tree
	 */
	void enterExpr_fun_call(PrevParser.Expr_fun_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_fun_call}.
	 * @param ctx the parse tree
	 */
	void exitExpr_fun_call(PrevParser.Expr_fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_alloc}.
	 * @param ctx the parse tree
	 */
	void enterExpr_alloc(PrevParser.Expr_allocContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_alloc}.
	 * @param ctx the parse tree
	 */
	void exitExpr_alloc(PrevParser.Expr_allocContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_compound}.
	 * @param ctx the parse tree
	 */
	void enterExpr_compound(PrevParser.Expr_compoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_compound}.
	 * @param ctx the parse tree
	 */
	void exitExpr_compound(PrevParser.Expr_compoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_typecast}.
	 * @param ctx the parse tree
	 */
	void enterExpr_typecast(PrevParser.Expr_typecastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_typecast}.
	 * @param ctx the parse tree
	 */
	void exitExpr_typecast(PrevParser.Expr_typecastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_enclosed}.
	 * @param ctx the parse tree
	 */
	void enterExpr_enclosed(PrevParser.Expr_enclosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_enclosed}.
	 * @param ctx the parse tree
	 */
	void exitExpr_enclosed(PrevParser.Expr_enclosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_infix_mul}.
	 * @param ctx the parse tree
	 */
	void enterExpr_infix_mul(PrevParser.Expr_infix_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_infix_mul}.
	 * @param ctx the parse tree
	 */
	void exitExpr_infix_mul(PrevParser.Expr_infix_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_infix_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_infix_add(PrevParser.Expr_infix_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_infix_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_infix_add(PrevParser.Expr_infix_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_infix_rel}.
	 * @param ctx the parse tree
	 */
	void enterExpr_infix_rel(PrevParser.Expr_infix_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_infix_rel}.
	 * @param ctx the parse tree
	 */
	void exitExpr_infix_rel(PrevParser.Expr_infix_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_infix_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_infix_and(PrevParser.Expr_infix_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_infix_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_infix_and(PrevParser.Expr_infix_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_infix_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_infix_or(PrevParser.Expr_infix_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_infix_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_infix_or(PrevParser.Expr_infix_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(PrevParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(PrevParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PrevParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PrevParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void enterStmt_expr(PrevParser.Stmt_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#stmt_expr}.
	 * @param ctx the parse tree
	 */
	void exitStmt_expr(PrevParser.Stmt_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void enterStmt_assign(PrevParser.Stmt_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void exitStmt_assign(PrevParser.Stmt_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#stmt_cond}.
	 * @param ctx the parse tree
	 */
	void enterStmt_cond(PrevParser.Stmt_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#stmt_cond}.
	 * @param ctx the parse tree
	 */
	void exitStmt_cond(PrevParser.Stmt_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrevParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void enterStmt_loop(PrevParser.Stmt_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrevParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void exitStmt_loop(PrevParser.Stmt_loopContext ctx);
}