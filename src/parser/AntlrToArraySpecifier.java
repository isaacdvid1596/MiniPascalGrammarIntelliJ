package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToArraySpecifier extends MiniPascalGrammarBaseVisitor<ArraySpecifier> {
    @Override
    public ArraySpecifier visitArraySpecifier(MiniPascalGrammarParser.ArraySpecifierContext ctx) {
        IndexRange indexRange = (IndexRange) ctx.getChild(2);
        return new ArraySpecifier(indexRange);
    }
}
