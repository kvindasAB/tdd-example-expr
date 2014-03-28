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

        String[] tokens;
        int result;
        if(s.contains("+") ){
            tokens = s.split("\\+");
            result = new Integer(tokens[0]) + new Integer(tokens[1]);
        }else if(s.contains("-")){
            tokens = s.split("\\-");
            result = new Integer(tokens[0]) - new Integer(tokens[1]);
        }else{
            result = new Integer(s);
        }

        return result;
    }

}
