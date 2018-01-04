package com.pluralsight.calcengine;

public class InvalidExceptionStatement extends Exception {

    public InvalidExceptionStatement(String reason , String statement) {
        super(reason + ": " + statement);

    }


    public InvalidExceptionStatement(String reason , String statement , Throwable cause) {
        super(reason + ": " + statement , cause);

    }
}
