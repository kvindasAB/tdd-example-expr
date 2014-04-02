package com.alivebox.tdd;

import com.alivebox.tdd.core.Element;
import com.alivebox.tdd.core.Operand;
import com.alivebox.tdd.core.Operator;

import java.util.ArrayList;
import java.util.List;

/**
 * Expression Evaluator
 * @author Alivebox
 */
public class Parser {

    public List<Element> parse(String s){
        List<Element> result = new ArrayList<Element>();
        String operand = "";
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            char tmpChar = chars[i];
            if(Character.isDigit(tmpChar)){
                operand += tmpChar;
            }else{
                result.add(new Operand(operand));
                operand = "";
                result.add(new Operator(tmpChar+""));
            }
        }
        if(!operand.equals("") ){
            result.add(new Operand(operand));
        }
        return result;
    }

}