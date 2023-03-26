package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToTerm extends MiniPascalGrammarBaseVisitor<Term> {
    ArrayList<MulOp> mulOps;
    ArrayList<Factor> otherFactors;
    @Override
    public Term visitTermino(MiniPascalGrammarParser.TerminoContext ctx) {
        Factor factor = (Factor) ctx.getChild(0);
        MulOp mulop = (MulOp) ctx.getChild(1);
        mulOps.add(mulop);
        Factor otherFactor = (Factor) ctx.getChild(2);
        otherFactors.add(otherFactor);
        if(ctx.getChildCount() > 1){
            return new Term(factor,mulOps,otherFactors);
        }else{
            return new Term(factor);
        }
    }
}
