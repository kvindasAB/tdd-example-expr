package com.alivebox.tdd.unit;

import com.alivebox.tdd.Evaluator;
import com.alivebox.tdd.core.Element;
import com.alivebox.tdd.core.Operand;
import com.alivebox.tdd.core.Operator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class EvaluatorTests {

    @Test(expected=Exception.class)
    public void nullOrEmptyStringThrowsException(){
        Evaluator sut = new Evaluator();
        sut.eval("");
    }

    @Test
    public void oneDigitNumberIsEvaluatedToItsIntegerValue(){
        checkEvaluation("7", 7);
    }

    @Test
    public void oneDigitNumberIsEvaluatedToItsIntegerValueSecondAttempt(){
        checkEvaluation("5", 5);
    }

    @Test
    public void multipleDigitsNumberEvaluatedToItsIntegerValue(){
        checkEvaluation("357", 357);
    }

    @Test
    public void AddingTwoNumbers()
    {
        checkEvaluation("1+2", 3);
    }

    @Test
    public void SubstractingTwoNumbers()
    {
        checkEvaluation("88-20", 68);
    }

    @Test
    public void ParseReturnsAdditionElements(){
        Evaluator sut = new Evaluator();
        List<Element> result = sut.parse("1+2");
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.get(0) instanceof Operand);
        Assert.assertTrue(result.get(1) instanceof Operator);
        Assert.assertTrue(result.get(2) instanceof Operand);
    }

    private void checkEvaluation(String s, int expected){
        Evaluator sut = new Evaluator();
        int result = sut.eval(s);
        Assert.assertEquals(expected, result);
    }

}
