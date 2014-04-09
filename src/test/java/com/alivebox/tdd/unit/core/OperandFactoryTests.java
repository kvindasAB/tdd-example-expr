package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.Operand;
import com.alivebox.tdd.core.OperandFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class OperandFactoryTests {

    protected OperandFactory operandFactory;

    @Before
    public void setUp() throws Exception {
        operandFactory = new OperandFactory();
    }

    @Test
    public void plusSignReturnsAddOperator(){
        Operand result = operandFactory.create(5);
        Assert.assertEquals(result.getValue(), 5);
    }

}
