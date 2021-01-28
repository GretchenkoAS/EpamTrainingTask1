package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArrayCalculation {
    static Logger logger = LogManager.getLogger();

    public int minElement(CustomArray customArray) throws ArrayException {
        int minElement = customArray.getElement(0);
        int size = customArray.size();
        for(int i = 1; i < size; i++){
            if (minElement > customArray.getElement(i)){
                minElement = customArray.getElement(i);
            }
        }
        logger.info("min element: " + minElement);
        return minElement;
    }

    public int minStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int minElement = IntStream.of(array)
                .min()
                .getAsInt();
        logger.info("min element: " + minElement);
        return minElement;
    }

    public int maxElement(CustomArray customArray) throws ArrayException {
        int maxElement = customArray.getElement(0);
        int size = customArray.size();
        for(int i = 1; i < size; i++){
            if (maxElement < customArray.getElement(i)){
                maxElement = customArray.getElement(i);
            }
        }
        logger.info("max element: " + maxElement);
        return maxElement;
    }

    public int maxStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int maxElement = IntStream.of(array)
                .max()
                .getAsInt();
        logger.info("max element: " + maxElement);
        return maxElement;
    }

    public double averageValue(CustomArray customArray) throws ArrayException {
        int sum = 0;
        int size = customArray.size();
        for(int i = 0; i < size; i++){
           sum += customArray.getElement(i);
        }
        double average = (double) sum / customArray.size();
        logger.info("average: " + average);
        return average;
    }

    public double averageValueStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        double average = IntStream.of(array)
                .average()
                .getAsDouble();
        logger.info("average: " + average);
        return average;
    }

    public int sumAllElements(CustomArray customArray) throws ArrayException {
        int sum = 0;
        int size = customArray.size();
        for(int i = 0; i < size; i++){
            sum += customArray.getElement(i);
        }
        logger.info("sum: " + sum);
        return sum;
    }

    public int sumAllElementsStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = IntStream.of(array)
                .sum();
        logger.info("sum: " + sum);
        return sum;
    }

    public int numberOfPositiveElement(CustomArray customArray) throws ArrayException {
        int count = 0;
        int size = customArray.size();
        for(int i = 0; i < size; i++){
            if (customArray.getElement(i) > 0){
                count += 1;
            }
        }
        logger.info("number of positive element: " + count);
        return count;
    }

    public long numberOfPositiveElementStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long result = IntStream.of(array)
                .filter(element -> element > 0)
                .count();
        logger.info("number of positive element: " + result);
        return result;
    }

    public int numberOfNegativeElement(CustomArray customArray) throws ArrayException {
        int count = 0;
        int size = customArray.size();
        for(int i = 0; i < size; i++){
            if (customArray.getElement(i) < 0){
                count += 1;
            }
        }
        logger.info("number of negative element: " + count);
        return count;
    }

    public long numberOfNegativeElementStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long result = IntStream.of(array)
                .filter(element -> element < 0)
                .count();
        logger.info("number of negative element: " + result);
        return result;
    }
}
