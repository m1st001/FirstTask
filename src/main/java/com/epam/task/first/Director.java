package com.epam.task.first;

import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.validator.ArrayValidator;

import java.util.List;

public class Director {
    private ArrayValidator validator;
    private ArrayCreator creator;
    private DataReader dataReader;

    public Director(ArrayValidator validator, ArrayCreator creator, DataReader dataReader) {
        this.validator = validator;
        this.creator = creator;
        this.dataReader = dataReader;
    }

    public List<Array> process(String filename){
        throw new UnsupportedOperationException();

    }
}
