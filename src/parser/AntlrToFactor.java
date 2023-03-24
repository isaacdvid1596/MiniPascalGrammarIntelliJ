package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToFactor extends MiniPascalGrammarBaseVisitor<Factor> {
    @Override
    public Factor visitIdentifierTerminal(MiniPascalGrammarParser.IdentifierTerminalContext ctx) {
        return super.visitIdentifierTerminal(ctx);
    }

    @Override
    public Factor visitNumberTerminal(MiniPascalGrammarParser.NumberTerminalContext ctx) {
        String text = ctx.getChild(0).getText();
        Integer number = Integer.parseInt(text);
        return new NumberClass(number);
    }

    @Override
    public Factor visitStringTerminal(MiniPascalGrammarParser.StringTerminalContext ctx) {
        String text = ctx.getChild(0).getText();
        return new StringClass(text);
    }

    @Override
    public Factor visitCharTerminal(MiniPascalGrammarParser.CharTerminalContext ctx) {
        String text = ctx.getChild(0).getText();
        char ch = text.charAt(0);
        return new CharClass(ch);
    }

    @Override
    public Factor visitBetweenParentsExpression(MiniPascalGrammarParser.BetweenParentsExpressionContext ctx) {
        return super.visitBetweenParentsExpression(ctx);
    }

    @Override
    public Factor visitNotFactorOperator(MiniPascalGrammarParser.NotFactorOperatorContext ctx) {
        return super.visitNotFactorOperator(ctx);
    }

    @Override
    public Factor visitTrueOperator(MiniPascalGrammarParser.TrueOperatorContext ctx) {
        return super.visitTrueOperator(ctx);
    }

    @Override
    public Factor visitFalseOperator(MiniPascalGrammarParser.FalseOperatorContext ctx) {
        return super.visitFalseOperator(ctx);
    }
}
