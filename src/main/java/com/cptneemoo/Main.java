package com.cptneemoo;

import com.cptneemoo.exception.DivisionByZeroException;

import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        try {
            log.info(String.format("Result of %d / %d = %d.", num1, num2,divide(num1,num2)));
        } catch (DivisionByZeroException e) {
            log.severe(String.format("Exception thrown of type %s with message %s", e.getClass(), e.getMessage()));
        }

    }

    static int divide(int num1, int num2) throws DivisionByZeroException {
        int result;
        try {
            result = num1 / num2;
        }
        catch (ArithmeticException e) {
            DivisionByZeroException ex = new DivisionByZeroException("Division by zero");
            ex.initCause(e);
            throw ex;
        }
        return result;
    }
}
