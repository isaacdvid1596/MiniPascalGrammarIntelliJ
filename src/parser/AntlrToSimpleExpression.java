package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToSimpleExpression extends MiniPascalGrammarBaseVisitor<SimpleExpression> {
    ArrayList<AddOp> addOps;
    @Override
    public SimpleExpression visitSimpleExpression(MiniPascalGrammarParser.SimpleExpressionContext ctx) {
        Term termino = (Term) ctx.getChild(0);
        AddOp addOperator = (AddOp) ctx.getChild(1);
        addOps.add(addOperator);
        Term otherTerm = (Term) ctx.getChild(2);
        if(ctx.getChildCount() > 1){
            return new SimpleExpression(termino);
        }else{
            return new SimpleExpression(termino,addOps,otherTerm);
        }
    }
}

