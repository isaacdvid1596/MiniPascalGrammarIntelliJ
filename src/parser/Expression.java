package parser;

import java.util.ArrayList;

public class Expression {
    private SimpleExpression simpleExpression;
    private SimpleExpression optionalExpression;
    private ArrayList<RelOp> relOps;

    public Expression(SimpleExpression simpleExpression) {
        this.simpleExpression = simpleExpression;
    }

    public Expression(SimpleExpression simpleExpression, ArrayList<RelOp> relOps,SimpleExpression optionalExpression) {
        this.simpleExpression = simpleExpression;
        this.relOps = relOps;
        this.optionalExpression = optionalExpression;
    }
}
