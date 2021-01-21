package com.gret.task1.action;

import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;

public class ArrayCalculation {
    public int minElement(Array array) throws ArrayException {
        int minElement = array.getElement(0);
        for(int i = 1; i < array.getLength(); i++){
            if (minElement > array.getElement(i)){
                minElement = array.getElement(i);
            }
        }
        return minElement;
    }

    public int maxElement(Array array) throws ArrayException {
        int maxElement = array.getElement(0);
        for(int i = 1; i < array.getLength(); i++){
            if (maxElement < array.getElement(i)){
                maxElement = array.getElement(i);
            }
        }
        return maxElement;
    }

    public double averageValue(Array array) throws ArrayException {
        int sum = 0;
        for(int i = 0; i < array.getLength(); i++){
           sum += array.getElement(i);
        }
        double average = (double) sum / array.getLength();
        return average;
    }

    public int numberOfPositiveElement(Array array) throws ArrayException {
        int count = 0;
        for(int i = 0; i < array.getLength(); i++){
            if (array.getElement(i) > 0){
                count += 1;
            }
        }
        return count;
    }

    public int numberOfNegativeElement(Array array) throws ArrayException {
        int count = 0;
        for(int i = 0; i < array.getLength(); i++){
            if (array.getElement(i) < 0){
                count += 1;
            }
        }
        return count;
    }

}
