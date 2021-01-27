package com.epam.task.first.data;

import java.util.List;

public interface DataReader {
    List<String> readData(String filename) throws DataException;
}
