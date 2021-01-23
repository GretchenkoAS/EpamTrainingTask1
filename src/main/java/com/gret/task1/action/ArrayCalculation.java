package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculation {
    static Logger logger = LogManager.getLogger();

    public int minElement(CustomArray customArray) throws ArrayException {
        int minElement = customArray.getElement(0);
        for(int i = 1; i < customArray.getLength(); i++){
            if (minElement > customArray.getElement(i)){
                minElement = customArray.getElement(i);
            }
        }
        logger.info("array minimum element: " + minElement);
        return minElement;
    }

    public int maxElement(CustomArray customArray) throws ArrayException {
        int maxElement = customArray.getElement(0);
        for(int i = 1; i < customArray.getLength(); i++){
            if (maxElement < customArray.getElement(i)){
                maxElement = customArray.getElement(i);
            }
        }
        logger.info("array maximum element: " + maxElement);
        return maxElement;
    }

    public double averageValue(CustomArray customArray) throws ArrayException {
        int sum = 0;
        for(int i = 0; i < customArray.getLength(); i++){
           sum += customArray.getElement(i);
        }
        double average = (double) sum / customArray.getLength();
        return average;
    }

    public int numberOfPositiveElement(CustomArray customArray) throws ArrayException {
        int count = 0;
        for(int i = 0; i < customArray.getLength(); i++){
            if (customArray.getElement(i) > 0){
                count += 1;
            }
        }
        return count;
    }

    public int numberOfNegativeElement(CustomArray customArray) throws ArrayException {
        int count = 0;
        for(int i = 0; i < customArray.getLength(); i++){
            if (customArray.getElement(i) < 0){
                count += 1;
            }
        }
        return count;
    }

}
