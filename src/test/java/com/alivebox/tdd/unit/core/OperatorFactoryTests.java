package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.AddOperator;
import com.alivebox.tdd.core.Operator;
import com.alivebox.tdd.core.OperatorFactory;
import com.alivebox.tdd.core.SubstractOperator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class OperatorFactoryTests {

    @Test
    public void plusSignReturnsAddOperator(){
        OperatorFactory sut = new OperatorFactory();
        Operator tmpOper =  sut.create("+");
        Assert.assertTrue(tmpOper instanceof AddOperator);
    }

    @Test
    public void minusSignReturnsSubstractOperator(){
        OperatorFactory sut = new OperatorFactory();
        Operator tmpOper =  sut.create("-");
        Assert.assertTrue(tmpOper instanceof SubstractOperator);
    }

    @Test (expected = Exception.class)
    public void unknownSignThrowsException(){
        OperatorFactory sut = new OperatorFactory();
        sut.create("x");
    }



}
