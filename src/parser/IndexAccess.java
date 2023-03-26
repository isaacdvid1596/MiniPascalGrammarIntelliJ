package parser;

import java.util.ArrayList;

public class IndexAccess {
    private Expression firstExpression;

    private ArrayList<Expression> otherExpressions;

    public IndexAccess(Expression firstExpression) {
        this.firstExpression = firstExpression;
    }

    public IndexAccess(Expression firstExpression, ArrayList<Expression> otherExpressions) {
        this.firstExpression = firstExpression;
        this.otherExpressions = otherExpressions;
    }
}
