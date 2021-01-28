package com.gret.task1.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {
    static Logger logger = LogManager.getLogger();

    public static boolean isStringArray(String arrayString, String delimiter) {
        boolean result = arrayString.matches("(\\d+(" + delimiter + ")?)+");
        logger.info(result);
        return result;
    }
}
