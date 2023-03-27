package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToWhile extends MiniPascalGrammarBaseVisitor <WhileStatement> {
    @Override
    public WhileStatement visitWhileStatement(MiniPascalGrammarParser.WhileStatementContext ctx) {
        Expression expresion = (Expression) ctx.getChild(1);
        Statement sttment = (Statement) ctx.getChild(3);
        return new WhileStatement(expresion,sttment);
    }
}
