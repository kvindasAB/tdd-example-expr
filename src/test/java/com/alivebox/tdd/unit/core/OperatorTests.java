package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.Operator;
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
public class OperatorTests {

    @Test
    public void constructorSetsValuePropertyCorrectly(){
        Operator sut = new Operator("+");
        Assert.assertEquals("+", sut.getValue());
    }

    @Test
     public void additionOperatorComputesCorrectValue(){
        Operator sut = new Operator("+");
        int result = sut.compute(new Operand("20"), new Operand("10"));
        Assert.assertEquals(30, result);
    }

    @Test
    public void substractOperatorComputesCorrectValue(){
        Operator sut = new Operator("-");
        int result = sut.compute(new Operand("20"), new Operand("10"));
        Assert.assertEquals(10, result);
    }

    @Test(expected=Exception.class)
    public void unknownOperatorThrowsOnCompute(){
        Operator sut = new Operator("");
        sut.compute(new Operand("20"), new Operand("20"));
    }

}
