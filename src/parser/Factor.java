package parser;

public class Factor {

    private String identifier;
    private IndexAccess indexAccess;
    private FunctionCall functionCall;
    private Expression expression;
    private Factor factor;

    public Factor(String identifier, IndexAccess indexAccess) {
        this.identifier = identifier;
        this.indexAccess = indexAccess;
    }

    public Factor(String identifier, FunctionCall functionCall) {
        this.identifier = identifier;
        this.functionCall = functionCall;
    }

    public Factor(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public Factor(String identifier, Factor factor) {
        this.identifier = identifier;
        this.factor = factor;
    }

    public Factor(Expression expression) {
        this.expression = expression;
    }

    public Factor(Factor factor) {
        this.factor = factor;
    }
}
