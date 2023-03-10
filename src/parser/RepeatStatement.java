package parser;

public class RepeatStatement extends Statement{
    private StatementList statementList;
    private Expression expression;

    public RepeatStatement(StatementList statementList, Expression expression) {
        this.statementList = statementList;
        this.expression = expression;
    }
}
