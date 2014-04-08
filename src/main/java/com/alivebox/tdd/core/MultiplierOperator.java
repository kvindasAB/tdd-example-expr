package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class MultiplierOperator extends Operator {

    public MultiplierOperator() {
        super("*");
    }

    public int compute(Operand left, Operand right){
        return left.getValue() * right.getValue();
    }
}
