package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class AddOperator extends Operator {

    public AddOperator() {
        super("+");
    }

    public int compute(Operand left, Operand right){
        return left.getValue() + right.getValue();
    }
}
