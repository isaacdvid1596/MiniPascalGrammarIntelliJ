// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalGrammarParser}.
 */
public interface MiniPascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniPascalGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link MiniPascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniPascalGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque}
	 * labeled alternative in {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiniPascalGrammarParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque}
	 * labeled alternative in {@link MiniPascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiniPascalGrammarParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProgramEndMarker}
	 * labeled alternative in {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 */
	void enterProgramEndMarker(MiniPascalGrammarParser.ProgramEndMarkerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramEndMarker}
	 * labeled alternative in {@link MiniPascalGrammarParser#program_end_marker}.
	 * @param ctx the parse tree
	 */
	void exitProgramEndMarker(MiniPascalGrammarParser.ProgramEndMarkerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniPascalGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniPascalGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySpecifier}
	 * labeled alternative in {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArraySpecifier(MiniPascalGrammarParser.ArraySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySpecifier}
	 * labeled alternative in {@link MiniPascalGrammarParser#array_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArraySpecifier(MiniPascalGrammarParser.ArraySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexRange}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 */
	void enterIndexRange(MiniPascalGrammarParser.IndexRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexRange}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_range}.
	 * @param ctx the parse tree
	 */
	void exitIndexRange(MiniPascalGrammarParser.IndexRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Indice}
	 * labeled alternative in {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndice(MiniPascalGrammarParser.IndiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Indice}
	 * labeled alternative in {@link MiniPascalGrammarParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndice(MiniPascalGrammarParser.IndiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniPascalGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniPascalGrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Real}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterReal(MiniPascalGrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitReal(MiniPascalGrammarParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MiniPascalGrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MiniPascalGrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChar(MiniPascalGrammarParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChar(MiniPascalGrammarParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(MiniPascalGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(MiniPascalGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArray(MiniPascalGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link MiniPascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArray(MiniPascalGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompountStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompountStatement(MiniPascalGrammarParser.CompountStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompountStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompountStatement(MiniPascalGrammarParser.CompountStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(MiniPascalGrammarParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementList}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(MiniPascalGrammarParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompountStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompountStatementNonTerminal(MiniPascalGrammarParser.CompountStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompountStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompountStatementNonTerminal(MiniPascalGrammarParser.CompountStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementNonTerminal(MiniPascalGrammarParser.AssignmentStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementNonTerminal(MiniPascalGrammarParser.AssignmentStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementNonTerminal(MiniPascalGrammarParser.IfStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementNonTerminal(MiniPascalGrammarParser.IfStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNonTerminal(MiniPascalGrammarParser.WhileStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNonTerminal(MiniPascalGrammarParser.WhileStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNonTerminal(MiniPascalGrammarParser.ForStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNonTerminal(MiniPascalGrammarParser.ForStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatementNonTerminal(MiniPascalGrammarParser.RepeatStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatementNonTerminal(MiniPascalGrammarParser.RepeatStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatementNonTerminal(MiniPascalGrammarParser.WriteStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatementNonTerminal(MiniPascalGrammarParser.WriteStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatementNonTerminal(MiniPascalGrammarParser.ReadStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatementNonTerminal(MiniPascalGrammarParser.ReadStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatementNonTerminal(MiniPascalGrammarParser.FunctionStatementNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatementNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatementNonTerminal(MiniPascalGrammarParser.FunctionStatementNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniPascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniPascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniPascalGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniPascalGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MiniPascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MiniPascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(MiniPascalGrammarParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(MiniPascalGrammarParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(MiniPascalGrammarParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(MiniPascalGrammarParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MiniPascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MiniPascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(MiniPascalGrammarParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(MiniPascalGrammarParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionEndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_end_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionEndStatement(MiniPascalGrammarParser.FunctionEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionEndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_end_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionEndStatement(MiniPascalGrammarParser.FunctionEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MiniPascalGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterList}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MiniPascalGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(MiniPascalGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterDeclaration}
	 * labeled alternative in {@link MiniPascalGrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(MiniPascalGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MiniPascalGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MiniPascalGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MiniPascalGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link MiniPascalGrammarParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MiniPascalGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentList}
	 * labeled alternative in {@link MiniPascalGrammarParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MiniPascalGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(MiniPascalGrammarParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndStatement}
	 * labeled alternative in {@link MiniPascalGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(MiniPascalGrammarParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expresion}
	 * labeled alternative in {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiniPascalGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expresion}
	 * labeled alternative in {@link MiniPascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiniPascalGrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MiniPascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MiniPascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MiniPascalGrammarParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Termino}
	 * labeled alternative in {@link MiniPascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MiniPascalGrammarParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierTerminal(MiniPascalGrammarParser.IdentifierTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierTerminal(MiniPascalGrammarParser.IdentifierTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberTerminal(MiniPascalGrammarParser.NumberTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberTerminal(MiniPascalGrammarParser.NumberTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringTerminal(MiniPascalGrammarParser.StringTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringTerminal(MiniPascalGrammarParser.StringTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharTerminal(MiniPascalGrammarParser.CharTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharTerminal(MiniPascalGrammarParser.CharTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BetweenParentsExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBetweenParentsExpression(MiniPascalGrammarParser.BetweenParentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BetweenParentsExpression}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBetweenParentsExpression(MiniPascalGrammarParser.BetweenParentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotFactorOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactorOperator(MiniPascalGrammarParser.NotFactorOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotFactorOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactorOperator(MiniPascalGrammarParser.NotFactorOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterTrueOperator(MiniPascalGrammarParser.TrueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitTrueOperator(MiniPascalGrammarParser.TrueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFalseOperator(MiniPascalGrammarParser.FalseOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseOperator}
	 * labeled alternative in {@link MiniPascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFalseOperator(MiniPascalGrammarParser.FalseOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariableNonTerminal(MiniPascalGrammarParser.VariableNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableNonTerminal}
	 * labeled alternative in {@link MiniPascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariableNonTerminal(MiniPascalGrammarParser.VariableNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(MiniPascalGrammarParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link MiniPascalGrammarParser#index_access}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(MiniPascalGrammarParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MiniPascalGrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MiniPascalGrammarParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MiniPascalGrammarParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MiniPascalGrammarParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MiniPascalGrammarParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalGrammarParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MiniPascalGrammarParser.MulopContext ctx);
}