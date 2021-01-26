package com.gret.task1.main;

import com.gret.task1.exeption.ArrayException;
import com.gret.task1.reader.CustomFileReader;
import com.gret.task1.validator.ArrayValidator;

import java.util.List;

public class ArrayMain {
    public static void main(String[] args) throws ArrayException {
        CustomFileReader reader = new CustomFileReader();
        List<String> lines = reader.readFromFile("data\\arrays.txt");
        ArrayValidator validator = new ArrayValidator();
        for(String line : lines){
        System.out.println(validator.isStringArray(line));
        }
    }
}
