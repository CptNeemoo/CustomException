package com.cptneemoo;

import com.cptneemoo.exception.DivisionByZeroException;

import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws DivisionByZeroException {
        try {
            int result = 1 / 0;
        }
        catch (ArithmeticException e){
            log.severe(String.format("Exception thrown of type %s",e.getClass()));
            throw new DivisionByZeroException();
        }
    }
}
