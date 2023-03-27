package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToParameterDeclaration extends MiniPascalGrammarBaseVisitor <ParameterDeclaration> {
    @Override
    public ParameterDeclaration visitParameterDeclaration(MiniPascalGrammarParser.ParameterDeclarationContext ctx) {
        String id_name = ctx.getChild(0).getText();
        Type datatype = (Type) ctx.getChild(2);
        return new ParameterDeclaration(id_name,datatype);
    }
}
