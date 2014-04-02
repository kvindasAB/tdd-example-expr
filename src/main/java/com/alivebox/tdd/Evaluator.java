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
public class Evaluator {

    public int eval(String s) throws RuntimeException{
        if(s == null || s.equals("")){
            throw new RuntimeException();
        }

        Parser parser = new Parser();
        List<Element> elements = parser.parse(s);
        int result;

        if(elements.size() > 1 && elements.get(1).getValue().equals("+") ){
            result = new Integer(elements.get(0).getValue()) + new Integer(elements.get(2).getValue());
        }else if(elements.size() > 1 && elements.get(1).getValue().equals("-")){
            result = new Integer(elements.get(0).getValue()) - new Integer(elements.get(2).getValue());
        }else{
            result = new Integer(s);
        }

        return result;
    }

}
