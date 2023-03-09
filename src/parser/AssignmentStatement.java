package parser;

public class AssignmentStatement extends Statement{
    private Variable variable;
    private Expression expression;
    private FunctionCall  functionCall;

    public AssignmentStatement(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public AssignmentStatement(Variable variable, FunctionCall functionCall) {
        this.variable = variable;
        this.functionCall = functionCall;
    }
}
