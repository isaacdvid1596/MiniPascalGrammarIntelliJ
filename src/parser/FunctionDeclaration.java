package parser;

public class FunctionDeclaration {
    private String identifier;
    private ParameterList parameterList;
    private Type type;
    private Block functionBlock;

    public FunctionDeclaration(String identifier, ParameterList parameterList, Type type, Block functionBlock) {
        this.identifier = identifier;
        this.parameterList = parameterList;
        this.type = type;
        this.functionBlock = functionBlock;
    }
}
