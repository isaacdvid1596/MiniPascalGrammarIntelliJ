package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

import java.util.ArrayList;

public class AntlrToBlock extends MiniPascalGrammarBaseVisitor<Block> {

    ArrayList<VarDeclaration> varDeclarations;
    ArrayList<FunctionDeclaration> functionDeclarations;
    ArrayList<CompoundStatement> compoundStatements;

    @Override
    public Block visitBloque(MiniPascalGrammarParser.BloqueContext ctx) {
        VarDeclaration varDeclaration = (VarDeclaration) ctx.getChild(0);
        FunctionDeclaration functionDeclaration = (FunctionDeclaration) ctx.getChild(1);
        CompoundStatement compoundStatement = (CompoundStatement) ctx.getChild(2);
        varDeclarations.add(varDeclaration);
        functionDeclarations.add(functionDeclaration);
        compoundStatements.add(compoundStatement);
        return new Block(varDeclarations,functionDeclarations,compoundStatements);
    }
}
