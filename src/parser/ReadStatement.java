package parser;

public class ReadStatement extends Statement{
    private VariableList variableList;

    public ReadStatement(VariableList variableList) {
        this.variableList = variableList;
    }
}
