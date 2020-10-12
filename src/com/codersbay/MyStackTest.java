package com.codersbay;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyStackTest {

    @Test
    public void testPushAndSizing() {

        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(113);
        assertEquals(myStack.getSize(), 2);

        myStack.push(2);
        assertEquals(myStack.getSize(), 3);

    }

    @Test
    public void testPop() throws StackTooSmallException {

        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        int pop = myStack.pop();
        assertEquals(pop, 40);

    }

    @Test
    public void testPopWithSpecificIndex() {

        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        int pop = myStack.myStacks.get(1);
        assertEquals(pop, 20);

    }

    @Test
    public void testStackTooSmallException() {

        MyStack myStack = new MyStack();

        assertThrows(StackTooSmallException.class, myStack::pop);
        assertThrows(StackTooSmallException.class, myStack::peek);
        assertThrows(StackTooSmallException.class, () -> {
            myStack.pop(1);
        });
    }
    
}
