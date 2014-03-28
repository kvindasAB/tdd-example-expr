package com.alivebox.tdd;

import java.util.StringTokenizer;

/**
 * Expression Evaluator
 * @author Alivebox
 */
public class Evaluator {

    public int eval(String s) throws RuntimeException{
        if(s == null || s.equals("")){
            throw new RuntimeException();
        }
        StringTokenizer stok = new StringTokenizer(s, "+");
        int result = 0;
        while(stok.hasMoreTokens()){
            String tmpToken = stok.nextToken();
            result += new Integer(tmpToken);
        }
        return result;
    }

}
