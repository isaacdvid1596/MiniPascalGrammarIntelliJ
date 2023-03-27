package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToReadStatement extends MiniPascalGrammarBaseVisitor<ReadStatement> {
    @Override
    public ReadStatement visitReadStatement(MiniPascalGrammarParser.ReadStatementContext ctx) {
        VariableList id_name = (VariableList) ctx.getChild(2);
        return new ReadStatement(id_name);
        //Revisar, deberia aceptar 2 variables por cerradura de kleene
    }
}
