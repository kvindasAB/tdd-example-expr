package com.alivebox.tdd.unit;

import com.alivebox.tdd.Evaluator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

    private void checkEvaluation(String s, int expected){
        Evaluator sut = new Evaluator();
        int result = sut.eval(s);
        Assert.assertEquals(expected, result);
    }

}