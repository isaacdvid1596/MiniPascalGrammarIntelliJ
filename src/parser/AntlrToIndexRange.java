package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToIndexRange extends MiniPascalGrammarBaseVisitor<IndexRange> {
    @Override
    public IndexRange visitIndexRange(MiniPascalGrammarParser.IndexRangeContext ctx) {
        String numberTo = ctx.getChild(0).getText();
        int numberToInt = Integer.parseInt(numberTo);
        String numberFrom = ctx.getChild(2).getText();
        int numberFromInt = Integer.parseInt(numberFrom);
        return new IndexRange(numberToInt,numberFromInt);
    }
}
