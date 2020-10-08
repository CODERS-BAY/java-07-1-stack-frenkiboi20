package com.codersbay;

public class StackTooSmallException extends Throwable {

    public StackTooSmallException() {
        System.err.println("Stack is too small !");
    }
}
