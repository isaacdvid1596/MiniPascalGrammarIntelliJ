package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToFunctionBlock extends MiniPascalGrammarBaseVisitor <FunctionBlock> {
    @Override
    public FunctionBlock visitFunctionBlock(MiniPascalGrammarParser.FunctionBlockContext ctx) {
        VarDeclaration var_name = (VarDeclaration) ctx.getChild(0);
        CompoundStatement statement = (CompoundStatement) ctx.getChild(1);
        if(ctx.getChildCount() > 1){
            return new FunctionBlock(var_name,statement);
        }else {
            return new FunctionBlock(statement);
        }
    }
}
