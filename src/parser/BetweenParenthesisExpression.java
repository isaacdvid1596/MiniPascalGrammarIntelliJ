package parser;

public class BetweenParenthesisExpression extends Factor{
    private Expression expression;

    public BetweenParenthesisExpression(Expression expression) {
        this.expression = expression;
    }
}
