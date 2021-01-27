package com.epam.task.first.logic;
import com.epam.task.first.validator.ArrayValidator;
import com.epam.task.first.Director;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;

import static org.mockito.Matchers.anyString;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class DirectorTest {
    private final static List<String> TEST_DATA = Arrays.asList("1 2 3", "а 8 б22");

    @Test
    public void testGeneral() throws DataException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);
        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        Director director = new Director(reader);
    }
}
