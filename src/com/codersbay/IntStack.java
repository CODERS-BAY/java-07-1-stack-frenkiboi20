package com.codersbay;

public class IntStack {

    public static void main(String[] args) throws StackTooSmallException {

        MyStack intStack = new MyStack();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        System.out.println("Stackgroesse: " + intStack.getSize());

        intStack.pop();
        System.out.println("Stackgroesse: " + intStack.getSize());

        intStack.peek();
        System.out.println("Stackgroesse: " + intStack.getSize());

        intStack.pop(2);
        System.out.println("Stackgroesse: " + intStack.getSize());

    }

}
