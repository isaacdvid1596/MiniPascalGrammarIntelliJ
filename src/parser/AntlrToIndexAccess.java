package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToIndexAccess extends MiniPascalGrammarBaseVisitor<IndexAccess> {
    private ArrayList<Expression> otherExpressions;
    @Override
    public IndexAccess visitIndexAccess(MiniPascalGrammarParser.IndexAccessContext ctx) {
        Expression expression = (Expression) ctx.getChild(1);
        Expression expressions = (Expression) ctx.getChild(2);
        otherExpressions.add(expressions);
        if(otherExpressions.isEmpty()){
            return new IndexAccess(expression);
        }else{
            return new IndexAccess(expression,otherExpressions);
        }
    }
}
