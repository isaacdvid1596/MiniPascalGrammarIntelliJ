package parser;

public class IfStatement extends Statement{
    private Expression expression;
    private Statement thenStatement;
    private Statement elseStatement;

    public IfStatement(Expression expression, Statement thenStatement) {
        this.expression = expression;
        this.thenStatement = thenStatement;
    }

    public IfStatement(Expression expression, Statement thenStatement, Statement elseStatement) {
        this.expression = expression;
        this.thenStatement = thenStatement;
        this.elseStatement = elseStatement;
    }
}
