package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class SubstractOperator extends Operator {

    public SubstractOperator() {
        super("-");
    }

    public int compute(Operand left, Operand right){
        return left.getValue() - right.getValue();
    }
}
