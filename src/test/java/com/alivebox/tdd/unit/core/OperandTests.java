package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.Operand;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class OperandTests {

    @Test()
    public void constructorSetsValuePropertyCorrectly(){
        Operand sut = new Operand("5");
        Assert.assertEquals(5, sut.getValue());
    }

    @Test()
    public void constructorSetsValuePropertyCorrectlyMultipleDigits(){
        Operand sut = new Operand("123");
        Assert.assertEquals(123, sut.getValue());
    }

}
