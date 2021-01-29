package com.gret.task1.entity;

import com.gret.task1.exeption.ArrayException;

public class CustomArray {
    private int[] array;

    public CustomArray(int... args) {
        this.array = args;
    }

    public int size() {
        return array.length;
    }

    public int getElement(int i) throws ArrayException {
        if (checkRange(i)) {
            return array[i];
        } else {
            throw new ArrayException("Out of range");
        }
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int... args) throws ArrayException {
        if(args == null) {
            throw new ArrayException("array is null");
        }
        this.array = args;
    }

    public void setElement(int i, int value) throws ArrayException {
        if (checkRange(i)) {
            array[i] = value;
        } else {
            throw new ArrayException("Out of range");
        }
    }
    private boolean checkRange(int i) {
        return (i >= 0 && i < array.length);
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("Array : [ ");
        for (int value : array) {
            s.append(value).append(BLANK);
        }
        s.append("]");
        return s.toString();
    }
}
