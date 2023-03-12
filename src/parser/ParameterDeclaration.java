package parser;

public class ParameterDeclaration {
    private String identifier;
    private Types type;

    public ParameterDeclaration(String identifier, Types type) {
        this.identifier = identifier;
        this.type = type;
    }
}
