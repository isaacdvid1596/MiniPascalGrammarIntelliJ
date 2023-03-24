package parser;

public class FunctionCall extends Statement{
    private String identifier;
    private ArgumentList argumentList;

    public FunctionCall(String identifier){
        this.identifier = identifier;
    }

    public FunctionCall(String identifier,ArgumentList argumentList){
        this.identifier = identifier;
        this.argumentList = argumentList;
    }
}
