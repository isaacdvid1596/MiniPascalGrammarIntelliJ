package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToStatementList extends MiniPascalGrammarBaseVisitor <StatementList> {
    @Override
    public StatementList visitStatementList(MiniPascalGrammarParser.StatementListContext ctx) {
        Statement statement = (Statement) ctx.getChild(0);
        Statement statementOptional = (Statement) ctx.getChild(2);
        if (ctx.getChildCount() > 1){
            return new StatementList(statement,statementOptional);
        }else{
            return new StatementList(statement);
        }
    }
}
