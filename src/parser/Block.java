package parser;

import java.util.ArrayList;

public class Block {
    private ArrayList<VarDeclaration> varDeclarations;
    private ArrayList<FunctionDeclaration> functionDeclarations;
    private ArrayList<CompoundStatement> compoundStatements;

    public Block(ArrayList<VarDeclaration> varDeclarations, ArrayList<FunctionDeclaration> functionDeclarations, ArrayList<CompoundStatement> compoundStatements) {
        this.varDeclarations = varDeclarations;
        this.functionDeclarations = functionDeclarations;
        this.compoundStatements = compoundStatements;
    }
}
