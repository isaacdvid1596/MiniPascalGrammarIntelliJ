package parser;

import java.util.ArrayList;

public class Block {
    private ArrayList<VarDeclaration> varDeclarations;
    private ArrayList<FunctionDeclaration> functionDeclarations;
    private ArrayList<CompoundStatement> compoundStatements;
    private ProgramEndMarker programEndMarker;
}
