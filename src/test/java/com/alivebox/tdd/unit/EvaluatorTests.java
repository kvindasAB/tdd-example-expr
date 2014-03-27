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
    public void NullOrEmptyStringThrowsException(){
        Evaluator sut = new Evaluator();
        sut.eval("");
    }

    @Test
    public void OneDigitNumberIsEvaluatedToItsIntegerValue(){
        Evaluator sut = new Evaluator();
        int result = sut.eval("7");
        Assert.assertEquals(7, result);
    }

    @Test
    public void OneDigitNumberIsEvaluatedToItsIntegerValueSecondAttempt(){
        Evaluator sut = new Evaluator();
        int result = sut.eval("5");
        Assert.assertEquals(5, result);
    }


    @Test
    public void MultipleDigitsNumberEvaluatedToItsIntegerValue(){
        Evaluator sut = new Evaluator();
        int result = sut.eval("357");
        Assert.assertEquals(357, result);
    }



}
