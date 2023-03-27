package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class FunctionCallToAntlr extends MiniPascalGrammarBaseVisitor <FunctionCall> {
    @Override
    public FunctionCall visitFunctionCall(MiniPascalGrammarParser.FunctionCallContext ctx) {
        String id_name =ctx.getChild(0).getText();
        ArgumentList arguments = (ArgumentList) ctx.getChild(1);
        if(ctx.getChildCount() > 1){
            return new FunctionCall(id_name);
        }else{
            return new FunctionCall(id_name, arguments);
        }
    }
}
