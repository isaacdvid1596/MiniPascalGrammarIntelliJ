package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToVarDeclaration extends MiniPascalGrammarBaseVisitor<VarDeclaration> {
    private ArrayList<VariableDeclaration> variableDeclarations;
    @Override
    public VarDeclaration visitVarDeclaration(MiniPascalGrammarParser.VarDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = (VariableDeclaration) ctx.getChild(1);
        variableDeclarations.add(variableDeclaration);
        return new VarDeclaration(variableDeclarations);
    }
}
