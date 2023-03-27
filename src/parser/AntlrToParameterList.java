package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToParameterList extends MiniPascalGrammarBaseVisitor<ParameterList> {
    @Override
    public ParameterList visitParameterList(MiniPascalGrammarParser.ParameterListContext ctx) {
        ParameterDeclaration paramDcl = (ParameterDeclaration) ctx.getChild(0);
        ParameterDeclaration optionalParamDcl = (ParameterDeclaration) ctx.getChild(2);
        if(ctx.getChildCount() > 1){
            return new ParameterList(paramDcl, optionalParamDcl);
        } else if (ctx.getChildCount() == 1) {
            return new ParameterList(paramDcl);
        }else {
            return new ParameterList();
        }
    }
}
