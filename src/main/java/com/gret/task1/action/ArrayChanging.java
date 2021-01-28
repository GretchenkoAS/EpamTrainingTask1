package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArrayChanging {
    static Logger logger = LogManager.getLogger();

    public void replaceNegativeElement(CustomArray customArray) throws ArrayException {
        int size = customArray.size();
        for (int i = 0; i < size; i++) {
            if (customArray.getElement(i) < 0) {
                customArray.setElement(i, -1 * customArray.getElement(i));
            }
        }
        logger.info("all negative elements replaced for opposite ones");
    }

    public void replaceNegativeElementStream(CustomArray customArray) throws ArrayException {
        customArray.setArray(IntStream.of(customArray.getArray())
                .map(element -> element = ((element < 0) ? -1 * element : element))
                .toArray());
        logger.info("all negative elements replaced for opposite ones");
    }
}
