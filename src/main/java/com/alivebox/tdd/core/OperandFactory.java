package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class OperandFactory {

    public OperandFactory() {
    }

    public Operand create(int value){
        return new Operand(value);
    }
}
