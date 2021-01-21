package com.gret.task1.builder;

import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;

public class ArrayBuilder {
    private int[] array;

    public ArrayBuilder(int length) throws ArrayException {
        if (length < 1) {
            throw new ArrayException("Incorrect array length");
        }
        this.array = new int[length];
    }

    public int[] getArray() {
        return array;
    }

    private void setElement(int i, int value) throws ArrayException {
        if (checkRange(i)) {
            array[i] = value;
        } else {
            throw new ArrayException("Out of range");
        }
    }

    private boolean checkRange(int i) {
        return (i >= 0 && i < array.length);
    }

    public void fillRandomized(int minValue, int maxValue) throws ArrayException {

        for (int i = 0; i < array.length; i++) {
            int value = (int) ((Math.random() * (maxValue - minValue)) + minValue);
            this.setElement(i, value);
        }
    }

    public void setArray(int[] array) throws ArrayException {
        if (this.array.length != array.length) {
            throw new ArrayException("Incorrect array length");
        }
        for (int i = 0; i < array.length; i++) {
            this.setElement(i, array[i]);
        }
    }

    public Array build() {
        return new Array(this);
    }

}
