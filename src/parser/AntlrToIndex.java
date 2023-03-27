package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToIndex extends MiniPascalGrammarBaseVisitor<Index> {
    @Override
    public Index visitIndice(MiniPascalGrammarParser.IndiceContext ctx) {
        int number = Integer.parseInt(ctx.getChild(0).getText());
        return new Index(number);
    }
}
