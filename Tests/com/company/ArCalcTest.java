package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 11.10.2016.
 */
public class ArCalcTest {

    int initValue = 3;
    int[] operands = new int[] {-5, -1, 0, 1, 5};
    int[] results;

    ArCalc ac;


    @Before
    public void setUp() throws Exception {
        results = new int[operands.length];
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getResult() throws Exception {
        int[] expResults = operands;

        for (int i = 0; i < operands.length; i++) {
            results[i] = new ArCalc(operands[i]).getResult();
        }

        assertArrayEquals(expResults, results);
    }

    @Test
    public void add() throws Exception {
        int[] expResults = new int[] {-2, 2, 3, 4, 8};

        for (int i = 0; i < operands.length; i++) {
            results[i] = new ArCalc(initValue).add(operands[i]).getResult();
        }

        assertArrayEquals(expResults, results);
    }

    @Test
    public void sub() throws Exception {
        int[] expResults = new int[] {8, 4, 3, 2, -2};

        for (int i = 0; i < operands.length; i++) {
            results[i] = new ArCalc(initValue).sub(operands[i]).getResult();
        }

        assertArrayEquals(expResults, results);
    }

    @Test
    public void mult() throws Exception {
        int[] expResults = new int[] {-15, -3, 0, 3, 15};

        for (int i = 0; i < operands.length; i++) {
            results[i] = new ArCalc(initValue).mult(operands[i]).getResult();
        }

        assertArrayEquals(expResults, results);
    }

    @Test
    public void div() throws Exception {
        int[] expResults = new int[] {-2, -12, 0, 12, 2};

        for (int i = 0; i < operands.length; i++) {
            if (operands[i] != 0) {
                results[i] = new ArCalc(12).div(operands[i]).getResult();
            } else {
                results[i] = 0;
            }
        }

        assertArrayEquals(expResults, results);
    }

    @Test(expected = ArithmeticException.class)
    public void divBy0() throws Exception {
        int result = new ArCalc(initValue).div(0).getResult();
    }
}