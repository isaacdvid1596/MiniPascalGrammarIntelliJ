package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToFunctionDeclaration extends MiniPascalGrammarBaseVisitor <FunctionDeclaration> {
    @Override
    public FunctionDeclaration visitFunctionDeclaration(MiniPascalGrammarParser.FunctionDeclarationContext ctx) {
        String id_name = ctx.getChild(1).getText();
        ParameterList pList = (ParameterList) ctx.getChild(3);
        Type datatype = (Type) ctx.getChild(6);
        Block bCode = (Block) ctx.getChild(8);
        return new FunctionDeclaration(id_name,pList,datatype,bCode);
    }
}
