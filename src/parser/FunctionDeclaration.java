package parser;

public class FunctionDeclaration {
    private String identifier;
    private ParameterList parameterList;
    private Types type;
    private FunctionBlock functionBlock;

    public FunctionDeclaration(String identifier, ParameterList parameterList, Types type, FunctionBlock functionBlock) {
        this.identifier = identifier;
        this.parameterList = parameterList;
        this.type = type;
        this.functionBlock = functionBlock;
    }
}
