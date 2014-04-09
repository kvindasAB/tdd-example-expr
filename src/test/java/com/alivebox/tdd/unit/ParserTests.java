package com.alivebox.tdd.unit;

import com.alivebox.tdd.Evaluator;
import com.alivebox.tdd.Parser;
import com.alivebox.tdd.core.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Parser tests
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class ParserTests {

    @Test(expected=Exception.class)
    public void nullOrEmptyStringThrowsException(){
        Evaluator sut = new Evaluator();
        sut.eval("");
    }

    @Test
    public void ParseReturnsAdditionElements(){
        Parser sut = new Parser(new OperatorFactory(), new OperandFactory());
        List<Element> result = sut.parse("1+2");
        Assert.assertEquals(3, result.size());
        int i = 0;
        Assert.assertTrue(result.get(i++) instanceof Operand);
        Assert.assertTrue(result.get(i++) instanceof Operator);
        Assert.assertTrue(result.get(i++) instanceof Operand);
    }



}
