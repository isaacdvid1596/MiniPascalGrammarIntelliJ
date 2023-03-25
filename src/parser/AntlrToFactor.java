package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;
import org.antlr.v4.runtime.Token;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

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
        Token charToken = ctx.CHAR().getSymbol();
        char ch = text.charAt(0);
        return new CharClass(ch);
    }

    @Override
    public Factor visitBetweenParentsExpression(MiniPascalGrammarParser.BetweenParentsExpressionContext ctx) {
        Factor factor = visit(ctx.getChild(1));
        return factor;
    }

    @Override
    public Factor visitNotFactorOperator(MiniPascalGrammarParser.NotFactorOperatorContext ctx) {
        Factor factor = visit(ctx.getChild(0));
        return factor;
    }

    @Override
    public Factor visitTrueOperator(MiniPascalGrammarParser.TrueOperatorContext ctx) {
        Factor factor = visit(ctx.getChild(0));
        return factor;
    }

    @Override
    public Factor visitFalseOperator(MiniPascalGrammarParser.FalseOperatorContext ctx) {
        Factor factor = visit(ctx.getChild(0));
        return factor;
    }
}
