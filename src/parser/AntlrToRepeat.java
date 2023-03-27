package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToRepeat extends MiniPascalGrammarBaseVisitor <RepeatStatement> {
    @Override
    public RepeatStatement visitRepeatStatement(MiniPascalGrammarParser.RepeatStatementContext ctx) {
        StatementList list = (StatementList) ctx.getChild(1);
        Expression expresion = (Expression) ctx.getChild(3);
        return new RepeatStatement(list, expresion);
    }
}
