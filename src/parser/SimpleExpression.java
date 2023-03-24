package parser;

public class SimpleExpression {
    private Term firstTerm;
    private Term optionalTerm;

    public SimpleExpression(Term firstTerm) {
        this.firstTerm = firstTerm;
    }

    public SimpleExpression(Term firstTerm, Term optionalTerm) {
        this.firstTerm = firstTerm;
        this.optionalTerm = optionalTerm;
    }
}
