package parser;

public class ParameterList {
    private ParameterDeclaration firstParam;
    private ParameterDeclaration optionalParam;

    public ParameterList(ParameterDeclaration firstParam, ParameterDeclaration optionalParam) {
        this.firstParam = firstParam;
        this.optionalParam = optionalParam;
    }
}
