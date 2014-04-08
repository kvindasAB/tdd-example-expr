package com.alivebox.tdd.unit.acceptance;

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
public class AcceptanceTests {

    @Test
    public void canAddTwoIntegerNumbers()
    {
        checkEvaluation("10+25", 35);
    }

    @Test
    public void canSubtractTwoIntegerNumbers()
    {
        checkEvaluation("300-5", 295);
    }

    @Test
    public void canMultiplyTwoIntegerNumbers()
    {
        checkEvaluation("12*30", 360);
    }

    @Test
    public void canDivideTwoIntegerNumbers()
    {
        checkEvaluation("30/5", 6);
    }

    private void checkEvaluation(String s, int expected){
        Evaluator sut = new Evaluator();
        int result = sut.eval(s);
        Assert.assertEquals(expected, result);
    }

}
