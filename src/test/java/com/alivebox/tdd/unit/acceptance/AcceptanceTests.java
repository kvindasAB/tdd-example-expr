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
    public void CanAddTwoIntegerNumbers()
    {
        Evaluator sut = new Evaluator();
        Number result = sut.eval("10+25");
        Assert.assertEquals(35, result);
    }

    @Test
    public void CanSubtractTwoIntegerNumbers()
    {
        Evaluator sut = new Evaluator();
        Number result = sut.eval("300-5");
        Assert.assertEquals(295, result);
    }

}
