package parser;

public class Variable {
    private String identifier;
    private IndexAccess indexAccess;

    public Variable(String identifier){
        this.identifier = identifier;
    }

    public Variable(String identifier, IndexAccess indexAccess) {
        this.identifier = identifier;
        this.indexAccess = indexAccess;
    }
}
