// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_end_marker(MiniPascalGrammarParser.Program_end_markerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniPascalGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(MiniPascalGrammarParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_specifier(MiniPascalGrammarParser.Array_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_range(MiniPascalGrammarParser.Index_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(MiniPascalGrammarParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniPascalGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(MiniPascalGrammarParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(MiniPascalGrammarParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(MiniPascalGrammarParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MiniPascalGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MiniPascalGrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MiniPascalGrammarParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(MiniPascalGrammarParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(MiniPascalGrammarParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(MiniPascalGrammarParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(MiniPascalGrammarParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MiniPascalGrammarParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(MiniPascalGrammarParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MiniPascalGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(MiniPascalGrammarParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_statement(MiniPascalGrammarParser.End_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniPascalGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(MiniPascalGrammarParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniPascalGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniPascalGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniPascalGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_access(MiniPascalGrammarParser.Index_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MiniPascalGrammarParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MiniPascalGrammarParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MiniPascalGrammarParser.MulopContext ctx);
}