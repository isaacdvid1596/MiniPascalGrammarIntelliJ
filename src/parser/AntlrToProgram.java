package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToProgram extends MiniPascalGrammarBaseVisitor<Program> {
    @Override
    public Program visitPrograma(MiniPascalGrammarParser.ProgramaContext ctx) {
        String id = ctx.getChild(1).getText();
        Block block = (Block) ctx.getChild(3);
        return new Program(id,block);
    }
}
