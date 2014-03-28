package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.Operator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class OperatorTests {

    @Test()
    public void constructorSetsValuePropertyCorrectly(){
        Operator sut = new Operator("+");
        Assert.assertEquals("+", sut.getValue());
    }

}
