package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToVariableDeclaration extends MiniPascalGrammarBaseVisitor<VariableDeclaration> {
    @Override
    public VariableDeclaration visitVariable_declaration(MiniPascalGrammarParser.Variable_declarationContext ctx) {
        String id = ctx.getChild(0).getText();
        Type type = (Type) ctx.getChild(2);
        ArraySpecifier arraySpecifier = (ArraySpecifier) ctx.getChild(3);
        if(arraySpecifier == null){
            return new VariableDeclaration(id,type);
        }else{
            return new VariableDeclaration(id,type,arraySpecifier);
        }
    }
}
