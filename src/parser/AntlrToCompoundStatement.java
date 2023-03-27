package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToCompoundStatement extends MiniPascalGrammarBaseVisitor<CompoundStatement> {
    @Override
    public CompoundStatement visitCompountStatement(MiniPascalGrammarParser.CompountStatementContext ctx) {
        StatementList statementList = (StatementList) ctx.getChild(1);
        return new CompoundStatement(statementList);
    }
}
