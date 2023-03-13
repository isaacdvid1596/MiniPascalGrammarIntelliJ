package parser;

public class VariableList {
    private Variable currentVariable;
    private Variable optionalVariable;

    public VariableList(Variable currentVariable, Variable optionalVariable) {
        this.currentVariable = currentVariable;
        this.optionalVariable = optionalVariable;
    }
}
