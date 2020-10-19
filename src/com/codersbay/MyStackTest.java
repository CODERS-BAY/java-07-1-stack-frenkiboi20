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
    public void testPopWithSpecificIndex() throws StackTooSmallException {

        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        assertEquals(myStack.pop(), 40);

        myStack.push(50);
        myStack.push(60);
        myStack.push(70);
        int[] nums = myStack.pop(3);
        assertEquals(nums[0], 50);
        assertEquals(nums[1], 60);
        assertEquals(nums[2], 70);
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
