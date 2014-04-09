package com.alivebox.tdd;

import com.alivebox.tdd.core.Element;
import com.alivebox.tdd.core.Operand;
import com.alivebox.tdd.core.OperandFactory;
import com.alivebox.tdd.core.OperatorFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Expression Evaluator
 * @author Alivebox
 */
public class Parser {

    private OperatorFactory operatorFactory;
    private OperandFactory operandFactory;

    public Parser(OperatorFactory operatorFactory, OperandFactory operandFactory) {
        this.operatorFactory = operatorFactory;
        this.operandFactory = operandFactory;
    }

    public List<Element> parse(String s){
        List<Element> result = new ArrayList<Element>();
        String operand = "";
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            char tmpChar = chars[i];
            if(Character.isDigit(tmpChar)){
                operand += tmpChar;
            }else{
                result.add( new Operand(new Integer(operand) ));
                operand = "";
                result.add( getOperatorFactory().create(tmpChar + ""));
            }
        }
        if(!operand.equals("") ){
            result.add(new Operand(new Integer(operand) ));
        }
        return result;
    }

    public OperatorFactory getOperatorFactory() {
        return operatorFactory;
    }

    public void setOperatorFactory(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
    }

    public OperandFactory getOperandFactory() {
        return operandFactory;
    }

    public void setOperandFactory(OperandFactory operandFactory) {
        this.operandFactory = operandFactory;
    }
}
