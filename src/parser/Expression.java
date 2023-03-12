package parser;

public class Expression {
    private SimpleExpression simpleExpression;
    private SimpleExpression optionalExpression;

    public Expression(SimpleExpression simpleExpression) {
        this.simpleExpression = simpleExpression;
    }

    public Expression(SimpleExpression simpleExpression, SimpleExpression optionalExpression) {
        this.simpleExpression = simpleExpression;
        this.optionalExpression = optionalExpression;
    }
}
