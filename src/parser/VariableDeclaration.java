package parser;

public class VariableDeclaration {
    private String identifier;
    private Type type;
    private ArraySpecifier arraySpecifier;

    public VariableDeclaration(String identifier, Type type, ArraySpecifier arraySpecifier) {
        this.identifier = identifier;
        this.type = type;
        this.arraySpecifier = arraySpecifier;
    }




}
