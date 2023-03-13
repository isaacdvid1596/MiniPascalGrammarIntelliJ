package parser;

public class WhileStatement extends Statement{
    private Expression expression;
    private Statement statement;

    public WhileStatement(Expression expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
    }
}
