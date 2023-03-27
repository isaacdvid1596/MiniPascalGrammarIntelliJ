package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToWrite extends MiniPascalGrammarBaseVisitor <WriteStatement> {
    @Override
    public WriteStatement visitWriteStatement(MiniPascalGrammarParser.WriteStatementContext ctx) {
        Expression expresion = (Expression) ctx.getChild(2);
        return new WriteStatement(expresion);
    }
}
