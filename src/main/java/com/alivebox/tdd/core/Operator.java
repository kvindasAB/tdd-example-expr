package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class Operator extends Element {

    private String value;

    public Operator(String argValue) {
        value = argValue;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
