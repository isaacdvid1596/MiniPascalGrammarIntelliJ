package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToSimpleExpression extends MiniPascalGrammarBaseVisitor<SimpleExpression> {
    @Override
    public SimpleExpression visitSimpleExpression(MiniPascalGrammarParser.SimpleExpressionContext ctx) {
        return super.visitSimpleExpression(ctx);
    }
}

