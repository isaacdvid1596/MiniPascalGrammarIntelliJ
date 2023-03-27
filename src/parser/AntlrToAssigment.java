package parser;

import antlr.MiniPascalGrammarBaseVisitor;
import antlr.MiniPascalGrammarParser;

public class AntlrToAssigment extends MiniPascalGrammarBaseVisitor <AssignmentStatement> {
    @Override
    public AssignmentStatement visitAssignmentStatement(MiniPascalGrammarParser.AssignmentStatementContext ctx) {

        Variable id_name = (Variable) ctx.getChild(1);
        Expression expresion = (Expression) ctx.getChild(3);
        FunctionCall func = (FunctionCall) ctx.getChild(3);
        //Aun por resolver
        if(expresion.toString().isEmpty()){
            return new AssignmentStatement(id_name, func);
        }else{
            return new AssignmentStatement(id_name, expresion);
        }
    }
}
