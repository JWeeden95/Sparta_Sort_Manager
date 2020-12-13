package com.sparta.jw.exceptions;

public class ChildNotFoundException extends Exception {

    public String leftChildMessage() {
        return "Left child doesn't exist for this element";
    }

    public String rightChildMessage(){
        return "Right child doesn't exist for this element";
    }
}
