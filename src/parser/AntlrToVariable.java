package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToVariable extends MiniPascalGrammarBaseVisitor<Variable> {
    @Override
    public Variable visitVariableNonTerminal(MiniPascalGrammarParser.VariableNonTerminalContext ctx) {
        String id = ctx.getChild(0).getText();
        IndexAccess indexAccess = (IndexAccess) ctx.getChild(1);
        if (indexAccess == null){
            return new Variable(id);
        }else{
            return new Variable(id,indexAccess);
        }
    }
}
