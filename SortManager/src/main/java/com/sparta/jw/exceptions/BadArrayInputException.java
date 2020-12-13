package com.sparta.jw.exceptions;

public class BadArrayInputException extends Exception{

    @Override
    public String getMessage() {
        return "Must be a positive integer";
    }
}
