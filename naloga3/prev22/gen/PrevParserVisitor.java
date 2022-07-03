// Generated from /Users/zigapk/University/prev/naloga3/prev22/src/prev/phase/synan/PrevParser.g4 by ANTLR 4.9.2


	package prev.phase.synan;
	
	import java.util.*;
	
	import prev.common.report.*;
	import prev.data.ast.tree.*;
	import prev.data.ast.tree.decl.*;
	import prev.data.ast.tree.expr.*;
	import prev.data.ast.tree.stmt.*;
	import prev.data.ast.tree.type.*;
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrevParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrevParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrevParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(PrevParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(PrevParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#decl_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_type(PrevParser.Decl_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#decl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var(PrevParser.Decl_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#decl_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_fun(PrevParser.Decl_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PrevParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_atomic(PrevParser.Type_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_named}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_named(PrevParser.Type_namedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_array(PrevParser.Type_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_pointer(PrevParser.Type_pointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_record(PrevParser.Type_recordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#type_enclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_enclosed(PrevParser.Type_enclosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PrevParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_const(PrevParser.Expr_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_var_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_var_access(PrevParser.Expr_var_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_fun_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_fun_call(PrevParser.Expr_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_alloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_alloc(PrevParser.Expr_allocContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_compound(PrevParser.Expr_compoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_typecast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_typecast(PrevParser.Expr_typecastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_enclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_enclosed(PrevParser.Expr_enclosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_infix_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix_mul(PrevParser.Expr_infix_mulContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_infix_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix_add(PrevParser.Expr_infix_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_infix_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix_rel(PrevParser.Expr_infix_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_infix_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix_and(PrevParser.Expr_infix_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_infix_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_infix_or(PrevParser.Expr_infix_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prefix(PrevParser.Expr_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PrevParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#stmt_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_expr(PrevParser.Stmt_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#stmt_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_assign(PrevParser.Stmt_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#stmt_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_cond(PrevParser.Stmt_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrevParser#stmt_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_loop(PrevParser.Stmt_loopContext ctx);
}