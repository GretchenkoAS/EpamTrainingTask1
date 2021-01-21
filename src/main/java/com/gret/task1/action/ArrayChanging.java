package com.gret.task1.action;

import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;

public class ArrayChanging {
    public void replaceNegativeElement(Array array) throws ArrayException {
        for(int i = 0; i < array.getLength(); i++){
            if (array.getElement(i) < 0){
                array.setElement(i, -1 * array.getElement(i));
            }
        }
    }
}
