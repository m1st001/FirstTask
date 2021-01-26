package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(3, actual);
    }


    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenArrayContainsZero() {
        //given
        Array array = new Array(0, 2, -22, 6);
        //when
        int actual = arrayLogic.findMax(array);
        //then
        Assert.assertEquals(6, actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 2, 22);
        //when
        int actual = arrayLogic.findMin(array);
        //then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testFindMinShouldFindMinWhenAnyNumbersApplied() {
        //given
        Array array = new Array(-7, 2, 0, 0, 422, -8, -7);
        //when
        int actual = arrayLogic.findMin(array);
        //then
        Assert.assertEquals(-8, actual);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 2, 3, 4, 5);
        //when
        double actual = arrayLogic.findAverage(array);
        //then
        Assert.assertEquals(3, actual, 0.001);

    }

    @Test
    public void testFindAverageShouldFindAverageWhenAnyNumbersApplied() {
        //given
        Array array = new Array(-1, 22, 0, 4, -5);
        //when
        double actual = arrayLogic.findAverage(array);
        //then
        Assert.assertEquals(4, actual, 0.001);

    }

    @Test
    public void testFindSumShouldFindSum() {
        //given
        Array array = new Array(1,12,32,0,-1);
        //when
        int actual = arrayLogic.findSum(array);
        //then
        Assert.assertEquals(44,actual);
    }

    @Test
    public void testFindNumberOfPositiveShouldFindNumberOfPositive() {
        //given
        Array array = new Array(1,2,3,0,-1,0);
        //when
        int actual = arrayLogic.findNumberOfPositive(array);
        //then
        Assert.assertEquals(3,actual);
    }

    @Test
    public void testFindNumberOfNegativeShouldFindNumberOfNegative() {
        //given
        Array array = new Array(1,-2,3,0,-1,-2);
        //when
        int actual = arrayLogic.findNumberOfNegative(array);
        //then
        Assert.assertEquals(3,actual);
    }





}
