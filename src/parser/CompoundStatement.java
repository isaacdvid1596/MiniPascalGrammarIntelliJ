package parser;

public class CompoundStatement extends Statement{
    private StatementList statementList;

    public CompoundStatement(StatementList statementList) {
        this.statementList = statementList;
    }
}
