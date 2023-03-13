package parser;

public class ArgumentList {
    private Expression mandatoryExpression;
    private Expression optionalExpressions;

    public ArgumentList(Expression mandatoryExpression){
        this.mandatoryExpression = mandatoryExpression;
    }

    public ArgumentList(Expression mandatoryExpression, Expression optionalExpressions){
        this.mandatoryExpression = mandatoryExpression;
        this.optionalExpressions = optionalExpressions;
    }
}
