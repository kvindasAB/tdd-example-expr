package com.alivebox.tdd.unit;

import com.alivebox.tdd.Evaluator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Project acceptance test
 * @author Alivebox
 */
@RunWith(JUnit4.class)
public class EvaluatorTests {

    @Test(expected=Exception.class)
    public void NullOrEmptyStringThrowsException(){
        Evaluator sut = new Evaluator();
        sut.Eval("");
    }



}
