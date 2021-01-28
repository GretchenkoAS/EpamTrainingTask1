package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArraySorting {
    static Logger logger = LogManager.getLogger();

    public void bubbleSort(CustomArray customArray) throws ArrayException {
        int size = customArray.size();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < size; i++) {
                if (customArray.getElement(i) < customArray.getElement(i - 1)) {
                    this.swap(customArray, i, i - 1);
                    needIteration = true;
                }
            }
        }
        logger.info("sorted array: " + customArray.toString());
    }

    public void hoareSort(CustomArray customArray, int leftBorder, int rightBorder) throws ArrayException {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int middle = (leftMarker + rightMarker) / 2;
        int pivot = customArray.getElement(middle);
        while (leftMarker <= rightMarker) {
            while (customArray.getElement(leftMarker) < pivot) {
                leftMarker++;
            }
            while (customArray.getElement(rightMarker) > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                this.swap(customArray, leftMarker, rightMarker);
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder) {
            hoareSort(customArray, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            hoareSort(customArray, leftBorder, rightMarker);
        }
    }

    public void selectionSort(CustomArray customArray) throws ArrayException {
        int size = customArray.size();
        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i; j < size; j++) {
                if (customArray.getElement(j) < customArray.getElement(minIndex)) {
                    minIndex = j;
                }
            }
            swap(customArray, i, minIndex);
        }
        logger.info("sorted array: " + customArray.toString());
    }

    public void sortStream(CustomArray customArray) throws ArrayException {
        customArray.setArray(IntStream.of(customArray.getArray())
                .sorted()
                .toArray());
        logger.info("sorted array: " + customArray.toString());
    }


    private void swap(CustomArray customArray, int index1, int index2) throws ArrayException {
        int value1 = customArray.getElement(index1);
        int value2 = customArray.getElement(index2);
        customArray.setElement(index1, value2);
        customArray.setElement(index2, value1);
    }
}
