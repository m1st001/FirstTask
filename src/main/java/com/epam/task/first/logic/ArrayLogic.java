package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayLogic {
    public int findMax(Array array) {
        int MaxNumber;
        List<Integer> elements = array.getElements();
        MaxNumber = Collections.max(elements);
        return MaxNumber;

    }

    public int findMin(Array array){
        int MinNumber;
        List<Integer> elements = array.getElements();
        MinNumber = Collections.min(elements);
        return MinNumber;
    }

    public double findAverage(Array array) {
        double Average;
        int sum = 0;
        List<Integer> elements = array.getElements();
        int ArraySize = elements.size() ;
        for(int i=0; i<ArraySize; i++){
            sum = sum + elements.get(i);

        }
        Average = sum/ArraySize;
        return Average;
    }

    public int findSum(Array array) {
        int sum = 0;
        List<Integer> elements = array.getElements();
        for(int i=0; i<elements.size(); i++){
            sum = sum + elements.get(i);

        }
        return sum;

    }

    public int findNumberOfPositive(Array array){
        int PositiveCounter = 0;
        List<Integer> elements = array.getElements();
        for(int i=0; i<elements.size(); i++){
            if(elements.get(i) > 0)
                PositiveCounter++;

        }
        return PositiveCounter;
    }

    public int findNumberOfNegative(Array array){
        int NegativeCounter = 0;
        List<Integer> elements = array.getElements();
        for(int i=0; i<elements.size(); i++){
            if(elements.get(i) < 0)
                NegativeCounter++;

        }
        return NegativeCounter;
    }
}
