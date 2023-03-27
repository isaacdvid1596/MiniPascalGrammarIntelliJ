package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToArgumentList extends MiniPascalGrammarBaseVisitor <ArgumentList> {
    @Override
    public ArgumentList visitArgumentList(MiniPascalGrammarParser.ArgumentListContext ctx) {
        Expression expresion = (Expression) ctx.getChild(0);
        Expression expresionOpcional = (Expression) ctx.getChild(1);
        if(ctx.getChildCount() > 1){
            return new ArgumentList (expresion);
        }else {
            return new ArgumentList(expresion, expresionOpcional);
        }
    }
}
