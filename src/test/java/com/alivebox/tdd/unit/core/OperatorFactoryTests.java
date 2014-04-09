package com.alivebox.tdd.unit.core;

import com.alivebox.tdd.core.*;
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
public class OperatorFactoryTests {

    protected OperatorFactory operatorFactory;

    @Before
    public void setUp() throws Exception {
        operatorFactory = new OperatorFactory();
    }

    @Test
    public void plusSignReturnsAddOperator(){
        check("+", AddOperator.class);
    }

    @Test
    public void minusSignReturnsSubstractOperator(){
        check("-", SubstractOperator.class);
    }

    @Test
    public void asteriskSignReturnsMultiplierOperator(){
        check("*", MultiplierOperator.class);
    }

    @Test
    public void slashSignReturnsMultiplierOperator(){
        check("/", DivisionOperator.class);
    }

    @Test (expected = Exception.class)
    public void unknownSignThrowsException(){
        getOperatorFactory().create("x");
    }

    private void check(String op, Class type) {
        Operator result = getOperatorFactory().create(op);
        Assert.assertEquals(result.getClass(), type);
    }

    public OperatorFactory getOperatorFactory() {
        return operatorFactory;
    }

    public void setOperatorFactory(OperatorFactory operatorFactory) {
        this.operatorFactory = operatorFactory;
    }

}
