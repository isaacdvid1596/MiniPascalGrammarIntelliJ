// Generated from java-escape by ANTLR 4.11.1

    package antlr;

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
	 * Visit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiniPascalGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque}
	 * labeled alternative in {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiniPascalGrammarParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgramEndMarker}
	 * labeled alternative in {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramEndMarker(MiniPascalGrammarParser.ProgramEndMarkerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniPascalGrammarParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySpecifier}
	 * labeled alternative in {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySpecifier(MiniPascalGrammarParser.ArraySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexRange}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexRange(MiniPascalGrammarParser.IndexRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Indice}
	 * labeled alternative in {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndice(MiniPascalGrammarParser.IndiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MiniPascalGrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(MiniPascalGrammarParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MiniPascalGrammarParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(MiniPascalGrammarParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MiniPascalGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MiniPascalGrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompountStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompountStatement(MiniPascalGrammarParser.CompountStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(MiniPascalGrammarParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(MiniPascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalGrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MiniPascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(MiniPascalGrammarParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(MiniPascalGrammarParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MiniPascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(MiniPascalGrammarParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionEndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_end_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionEndStatement(MiniPascalGrammarParser.FunctionEndStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MiniPascalGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(MiniPascalGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MiniPascalGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link MiniPascalGrammarParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MiniPascalGrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(MiniPascalGrammarParser.EndStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expresion}
	 * labeled alternative in {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiniPascalGrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MiniPascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiniPascalGrammarParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierTerminal(MiniPascalGrammarParser.IdentifierTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTerminal(MiniPascalGrammarParser.NumberTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTerminal(MiniPascalGrammarParser.StringTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTerminal(MiniPascalGrammarParser.CharTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenParentsExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenParentsExpression(MiniPascalGrammarParser.BetweenParentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFactorOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactorOperator(MiniPascalGrammarParser.NotFactorOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueOperator(MiniPascalGrammarParser.TrueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseOperator(MiniPascalGrammarParser.FalseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNonTerminal(MiniPascalGrammarParser.VariableNonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(MiniPascalGrammarParser.IndexAccessContext ctx);
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