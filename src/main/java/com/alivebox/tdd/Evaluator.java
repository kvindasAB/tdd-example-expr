package com.alivebox.tdd;

import com.alivebox.tdd.core.*;

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

        Parser parser = new Parser(new OperatorFactory(), new OperandFactory());
        List<Element> elements = parser.parse(s);
        int result;

        if(elements.size() == 3 ){
            Operator oper = (Operator) elements.get(1);
            Operand left = (Operand) elements.get(0);
            Operand right = (Operand) elements.get(2);
            result = oper.compute(left, right );
        }else{
            result = new Integer(s);
        }

        return result;
    }

}
