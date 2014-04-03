package com.alivebox.tdd.core;

/**
 * Represents an expression operator
 */
public class OperatorFactory {

    public OperatorFactory() {
    }

    public Operator create(String argOp){
        if(argOp.equals("+")){
            return new AddOperator();
        }
        if(argOp.equals("-")){
            return new SubstractOperator();
        }
        throw new RuntimeException("Invalid operator");
    }
}
