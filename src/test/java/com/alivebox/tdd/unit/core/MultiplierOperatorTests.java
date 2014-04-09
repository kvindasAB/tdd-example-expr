package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.MultiplierOperator;
import com.alivebox.tdd.core.Operand;
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
public class MultiplierOperatorTests {

    @Test
     public void multiplierOperatorComputesCorrectValue(){
        Operator sut = new MultiplierOperator();
        int result = sut.compute(new Operand(12), new Operand(3));
        Assert.assertEquals(36, result);
    }

}
