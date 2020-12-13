package com.sparta.jw.exceptions;

public class MaxArrayLimitException extends Exception{

    public String getMessage() {
        return "You cannot have an array this large, max limit is set to 8892";
    }
}
