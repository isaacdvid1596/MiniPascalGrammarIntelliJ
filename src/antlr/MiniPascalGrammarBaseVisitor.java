//package antlr;// Generated from java-escape by ANTLR 4.11.1
//import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
//
///**
// * This class provides an empty implementation of {@link MiniPascalGrammarVisitor},
// * which can be extended to create a visitor which only needs to handle a subset
// * of the available methods.
// *
// * @param <T> The return type of the visit operation. Use {@link Void} for
// * operations with no return type.
// */
//@SuppressWarnings("CheckReturnValue")
//public class MiniPascalGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MiniPascalGrammarVisitor<T> {
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitProgram(MiniPascalGrammarParser.ProgramContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitProgram_end_marker(MiniPascalGrammarParser.Program_end_markerContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitBlock(MiniPascalGrammarParser.BlockContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitVar_declaration(MiniPascalGrammarParser.Var_declarationContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitArray_specifier(MiniPascalGrammarParser.Array_specifierContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitIndex_range(MiniPascalGrammarParser.Index_rangeContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitIndex(MiniPascalGrammarParser.IndexContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitType(MiniPascalGrammarParser.TypeContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitCompound_statement(MiniPascalGrammarParser.Compound_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStatement_list(MiniPascalGrammarParser.Statement_listContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitStatement(MiniPascalGrammarParser.StatementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitAssignment_statement(MiniPascalGrammarParser.Assignment_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitIf_statement(MiniPascalGrammarParser.If_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitWhile_statement(MiniPascalGrammarParser.While_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitFor_statement(MiniPascalGrammarParser.For_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitRepeat_statement(MiniPascalGrammarParser.Repeat_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitWrite_statement(MiniPascalGrammarParser.Write_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitRead_statement(MiniPascalGrammarParser.Read_statementContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitExpression(MiniPascalGrammarParser.ExpressionContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitSimple_expression(MiniPascalGrammarParser.Simple_expressionContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitTerm(MiniPascalGrammarParser.TermContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitFactor(MiniPascalGrammarParser.FactorContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitVariable(MiniPascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitIndex_access(MiniPascalGrammarParser.Index_accessContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitRelop(MiniPascalGrammarParser.RelopContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitAddop(MiniPascalGrammarParser.AddopContext ctx) { return visitChildren(ctx); }
//	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//	@Override public T visitMulop(MiniPascalGrammarParser.MulopContext ctx) { return visitChildren(ctx); }
//}