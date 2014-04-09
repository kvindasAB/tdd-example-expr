package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class DivisionOperator extends Operator {

    public DivisionOperator() {
        super("/");
    }

    public int compute(Operand left, Operand right){
        return left.getValue() / right.getValue();
    }
}
