package com.gret.task1.parser;

import com.gret.task1.exeption.ArrayException;
import com.gret.task1.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayParser {
    static Logger logger = LogManager.getLogger();
    static final String DELIMITER_SPACE = "\\s";

    public int[] parseLineToIntArray(String arrayStringFormat) throws ArrayException {
        if(!ArrayValidator.isStringArray(arrayStringFormat, DELIMITER_SPACE)){
            throw new ArrayException("string is not valid");
        }
        String stringArray[] = arrayStringFormat.split(DELIMITER_SPACE);
        int numericArray[] = new int[stringArray.length];
        try {
            for (int i = 0; i < stringArray.length; i++) {
                numericArray[i] = Integer.parseInt(stringArray[i]);
            }
        } catch (NumberFormatException e) {
            logger.error("Parser error");
            throw new ArrayException(e);
        }
        logger.info("parsing successful");
        return numericArray;
    }

    public int[] parseLineToIntArrayStream(String arrayStringFormat) throws ArrayException {
        if(!ArrayValidator.isStringArray(arrayStringFormat, DELIMITER_SPACE)){
            throw new ArrayException("string is not valid");
        }
        int[] numericArray;
        String stringArray[] = arrayStringFormat.split(DELIMITER_SPACE);
        try {
            numericArray = Stream.of(stringArray)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            logger.error("Parser error");
            throw new ArrayException(e);
        }
        logger.info("parsing successful");
        return numericArray;
    }
}
