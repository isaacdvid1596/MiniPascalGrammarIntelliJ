package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToStatement extends MiniPascalGrammarBaseVisitor<Statement> {

    @Override
    public Statement visitAssignmentStatement(MiniPascalGrammarParser.AssignmentStatementContext ctx) {
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public Statement visitIfStatement(MiniPascalGrammarParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public Statement visitWhileStatement(MiniPascalGrammarParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Statement visitForStatement(MiniPascalGrammarParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }

    @Override
    public Statement visitRepeatStatement(MiniPascalGrammarParser.RepeatStatementContext ctx) {
        return super.visitRepeatStatement(ctx);
    }

    @Override
    public Statement visitWriteStatement(MiniPascalGrammarParser.WriteStatementContext ctx) {
        return super.visitWriteStatement(ctx);
    }

    @Override
    public Statement visitReadStatement(MiniPascalGrammarParser.ReadStatementContext ctx) {
        return super.visitReadStatement(ctx);
    }

    @Override
    public Statement visitFunctionCall(MiniPascalGrammarParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }
}
