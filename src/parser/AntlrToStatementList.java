package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToStatementList extends MiniPascalGrammarBaseVisitor <StatementList> {
    @Override
    public StatementList visitStatementList(MiniPascalGrammarParser.StatementListContext ctx) {
        Statement sttment = (Statement) ctx.getChild(0);
        Statement sttmentOptional = (Statement) ctx.getChild(2);
        if (ctx.getChildCount() > 1){
            return new StatementList(sttment,sttmentOptional);
        }else{
            return new StatementList(sttment);
        }
    }
}
