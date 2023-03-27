package parser;

public class IdentifierTerminal extends Factor{
    private String identifier;
    private IndexAccess indexAccess;
    private FunctionCall functionCall;
    private Expression expression;
    private Factor factor;

    public IdentifierTerminal(String identifier, IndexAccess indexAccess) {
        this.identifier = identifier;
        this.indexAccess = indexAccess;
    }

    public IdentifierTerminal(String identifier, FunctionCall functionCall) {
        this.identifier = identifier;
        this.functionCall = functionCall;
    }

    public IdentifierTerminal(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public IdentifierTerminal(String identifier, Factor factor) {
        this.identifier = identifier;
        this.factor = factor;
    }
}
