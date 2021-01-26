package com.gret.task1.validator;

public class ArrayValidator {

    private static final String ARRAY_REGEX = "([0-9]+\\s??)+";


    public static boolean isStringArray(String str) {
        boolean result;
        boolean hasOtherChars = !str.matches(ARRAY_REGEX);
        if (!hasOtherChars) {
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
