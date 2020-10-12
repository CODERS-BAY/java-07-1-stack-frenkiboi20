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
        int lastElement = 0;
        if (myStacks.isEmpty()) throw new StackTooSmallException();
        else if (myStacks.size() > 0) return myStacks.get(myStacks.size()-1);
        return lastElement;
        /*
        int lastElement = 0;
        if (myStacks.isEmpty()) {
            throw new StackTooSmallException();
        } else {
            if (myStacks.size() > 0) {
                lastElement = myStacks.size();
                myStacks.remove(myStacks.size() - 1);
                return lastElement;
            }
        }
        return lastElement;

         */
    }

    public int peek() throws StackTooSmallException {
        if (myStacks.size() > 0) {
            return myStacks.size() - 1;
        } else {
            throw new StackTooSmallException();
        }
    }

    public int[] pop(int n) throws StackTooSmallException {
        if (myStacks.size() > 0) {
            for (int i = 0; i < n; i++) {
                myStacks.remove(myStacks.size() - 1 - i);
            }
            int[] nums = new int[myStacks.size()];
            for (int i = 0; i < myStacks.size(); i++) {
                nums[i] = myStacks.get(i);
            }
            return nums;
        } else throw new StackTooSmallException();
    }

}


