package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by admin on 11.10.2016.
 */
public class ArCalc {

    static protected Logger LOGGER = Logger.getLogger(ArCalc.class.getName());
    
    int result;

    public ArCalc(int firstOperand) {
        this.result = firstOperand;
        LOGGER.log(Level.INFO, "ArCalc instance was created");
    }

    public int getResult() {
        LOGGER.log(Level.INFO, "result returned - " + result);
        return result;
    }

    public ArCalc add(int operand) {
        result =+ operand;
        return this;
    }

    public ArCalc sub(int operand) {
        result =- operand;
        return this;
    }

    public ArCalc mult(int operand) {
        result = result * operand;
        return this;
    }

    public ArCalc div(int operand) {
        try {
            result = result / operand;
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "", e);
            throw e;
        }
        return this;
    }
    
}
