package parser;

public class FunctionBlock {
    private VarDeclaration varDeclaration;
    private CompoundStatement compoundStatement;

    public FunctionBlock(CompoundStatement compoundStatement) {
        this.compoundStatement = compoundStatement;
    }

    public FunctionBlock(VarDeclaration varDeclaration, CompoundStatement compoundStatement) {
        this.varDeclaration = varDeclaration;
        this.compoundStatement = compoundStatement;
    }
}
