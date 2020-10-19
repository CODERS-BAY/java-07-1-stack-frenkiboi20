package com.codersbay;

import java.util.ArrayList;

public class MyStack {

    public ArrayList<Integer> myStacks;

    public MyStack() {
        myStacks = new ArrayList<>();
    }

    public void push(int newElement) {
        myStacks.add(newElement);
    }

    public int getSize() {
        return myStacks.size();
    }

    public int pop() throws StackTooSmallException {
        if (myStacks.isEmpty()) {
            throw new StackTooSmallException();
        } else {
            return myStacks.remove(myStacks.size()-1);
        }

    }

    public int peek() throws StackTooSmallException {
        if (myStacks.size() > 0) {
            return myStacks.size() - 1;
        } else {
            throw new StackTooSmallException();
        }
    }

    public int[] pop(int n) throws StackTooSmallException {
        if (n > myStacks.size()) {
            throw new StackTooSmallException();
        }
        int[] nums = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            nums[i] = myStacks.remove(myStacks.size() - 1);
        }
        return nums;
    }

}


