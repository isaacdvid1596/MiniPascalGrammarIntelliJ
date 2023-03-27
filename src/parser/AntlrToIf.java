package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToIf extends MiniPascalGrammarBaseVisitor <IfStatement> {
    @Override
    public IfStatement visitIfStatement(MiniPascalGrammarParser.IfStatementContext ctx) {
        Expression expresion = (Expression) ctx.getChild(1);
        Statement sttment = (Statement) ctx.getChild(3);
        Statement sttment2 = (Statement) ctx.getChild(5);
        if(ctx.getChildCount() > 1){
            return new IfStatement(expresion, sttment, sttment2 );
        } else {
            return new IfStatement(expresion, sttment);
        }
    }
}
