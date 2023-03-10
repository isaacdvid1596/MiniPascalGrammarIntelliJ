package parser;

public class ForStatement extends Statement{
    private String identifier;
    private Expression firstExpression;
    private Expression secondExpression;
    private Statement statement;

    public ForStatement(String identifier, Expression firstExpression, Expression secondExpression, Statement statement) {
        this.identifier = identifier;
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.statement = statement;
    }
}
