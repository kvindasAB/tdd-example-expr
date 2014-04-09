package com.alivebox.tdd.core;

/**
 * Represents an expression operand
 */
public class Operand extends Element{

    private int value;

    public Operand(int argValue) {
        setValue(argValue);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
