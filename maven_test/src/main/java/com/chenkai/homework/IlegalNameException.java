package com.chenkai.homework;

public class IlegalNameException extends Exception{
    public IlegalNameException() {
    }

    public IlegalNameException(String s) {
        super(s);
    }
}
