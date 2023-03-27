package parser;

public class ParameterDeclaration {
    private String identifier;
    private Type type;

    public ParameterDeclaration(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }
}
