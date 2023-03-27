package parser;

import java.util.ArrayList;

public class SimpleExpression {
    private Term firstTerm;
    private Term optionalTerm;
    private ArrayList<AddOp> addOps;
    public SimpleExpression(Term firstTerm) {
        this.firstTerm = firstTerm;
    }

    public SimpleExpression(Term firstTerm,ArrayList<AddOp> addOps, Term optionalTerm) {
        this.firstTerm = firstTerm;
        this.addOps = addOps;
        this.optionalTerm = optionalTerm;
    }
}
