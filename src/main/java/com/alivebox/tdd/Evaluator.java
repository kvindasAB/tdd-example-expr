package com.alivebox.tdd;

/**
 * Expression Evaluator
 * @author Alivebox
 */
public class Evaluator {

    public int eval(String s) throws RuntimeException{
        if(s == null || s.equals("")){
            throw new RuntimeException();
        }
        return new Integer(s);
    }

}
