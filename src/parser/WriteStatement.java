package parser;

public class WriteStatement extends Statement{
    private Expression expression;

    public WriteStatement(Expression expression) {
        this.expression = expression;
    }
}
