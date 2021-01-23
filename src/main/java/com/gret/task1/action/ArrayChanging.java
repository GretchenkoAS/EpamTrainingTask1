package com.gret.task1.action;

import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;

public class ArrayChanging {
    public void replaceNegativeElement(CustomArray customArray) throws ArrayException {
        for(int i = 0; i < customArray.getLength(); i++){
            if (customArray.getElement(i) < 0){
                customArray.setElement(i, -1 * customArray.getElement(i));
            }
        }
    }
}
