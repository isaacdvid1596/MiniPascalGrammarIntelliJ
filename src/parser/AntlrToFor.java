package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToFor extends MiniPascalGrammarBaseVisitor<ForStatement> {
    @Override
    public ForStatement visitForStatement(MiniPascalGrammarParser.ForStatementContext ctx) {
        String id_name = ctx.getChild(1).getText();
        Expression expresion = (Expression) ctx.getChild(3);
        Expression expresion2 = (Expression) ctx.getChild(5);
        Statement sttment = (Statement) ctx.getChild(7);
        return new ForStatement (id_name, expresion, expresion2, sttment);
    }
}
