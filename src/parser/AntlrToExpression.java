package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToExpression extends MiniPascalGrammarBaseVisitor<Expression> {
    ArrayList<RelOp> relOps;

    @Override
    public Expression visitExpresion(MiniPascalGrammarParser.ExpresionContext ctx) {
        SimpleExpression simple = (SimpleExpression) ctx.getChild(0);
        RelOp relOperator = (RelOp) ctx.getChild(1);
        relOps.add(relOperator);
        SimpleExpression anotherSimple = (SimpleExpression) ctx.getChild(2);
        if(ctx.getChildCount() > 1){
            return new Expression(simple);
        }else{
            return new Expression(simple, relOps,anotherSimple);
        }
    }
}
