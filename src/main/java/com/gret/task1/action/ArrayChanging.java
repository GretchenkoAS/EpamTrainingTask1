package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;

public class ArrayChanging {
    public void replaceNegativeElement(CustomArray customArray) throws ArrayException {
        int size = customArray.size();
        for(int i = 0; i < size; i++){
            if (customArray.getElement(i) < 0){
                customArray.setElement(i, -1 * customArray.getElement(i));
            }
        }
    }
}
