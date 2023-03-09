package parser;

public class StatementList {
    private Statement CurrentStatement;
    private Statement NextStatement;

    public StatementList(Statement currentStatement, Statement nextStatement) {
        CurrentStatement = currentStatement;
        NextStatement = nextStatement;
    }
}
