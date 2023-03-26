package parser;

import java.util.ArrayList;

public class Term {
    private Factor factor;

    private ArrayList<MulOp> mulOps;

    private ArrayList<Factor> otherFactors;

    public Term(Factor factor) {
        this.factor = factor;
    }

    public Term(Factor factor, ArrayList<MulOp> mulOps, ArrayList<Factor> otherFactors) {
        this.factor = factor;
        this.mulOps = mulOps;
        this.otherFactors = otherFactors;
    }

}
