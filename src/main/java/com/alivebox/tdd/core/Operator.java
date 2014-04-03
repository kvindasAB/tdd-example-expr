package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class Operator extends Element {

    public Operator(String argValue) {
        super(argValue);
    }

    public int compute(int left, int right){
        if(getValue().equals("+")){
            return left + right;
        }
        if(getValue().equals("-")){
            return left - right;
        }
        throw new RuntimeException("Unknown operator");
    }
}
