package com.gret.task1.parser;

import com.gret.task1.exeption.ArrayException;

public class FileParser {
    public int[] parseLineToIntArray(String arrayStringFormat) throws ArrayException {
        String stringArray[] = arrayStringFormat.split(" ");
        int numericArray[] = new int[stringArray.length];
        try {
            for (int i = 0; i < stringArray.length; i++) {
                numericArray[i] = Integer.parseInt(stringArray[i]);
            }
        } catch (NumberFormatException e) {
            throw new ArrayException("Parser error", e);
        }
        return numericArray;
    }
}
