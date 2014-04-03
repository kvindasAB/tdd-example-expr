package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class Operator extends Element {

    private String value;

    public Operator(String argValue) {
        value = argValue;
    }

    public int compute(Operand left, Operand right){
        throw new RuntimeException("Should be implemented in subclasses");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
