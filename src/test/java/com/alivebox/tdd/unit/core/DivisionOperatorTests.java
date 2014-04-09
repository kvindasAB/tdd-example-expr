package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.DivisionOperator;
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
public class DivisionOperatorTests {

    @Test
     public void divisionOperatorComputesCorrectValue(){
        Operator sut = new DivisionOperator();
        int result = sut.compute(new Operand(20), new Operand(10));
        Assert.assertEquals(2, result);
    }

}
