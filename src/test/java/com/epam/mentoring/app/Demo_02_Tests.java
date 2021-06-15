package com.epam.mentoring.app;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_02_Tests {
    @Test
    public void testBothPositiveNumbers() {
        int firstNumber = 10;
        int secondNumber = 20;
        int expected = 20;
        int actual = Demo_02_FindMaxNumber.findMaximumNumber(firstNumber, secondNumber);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBothNegativeNumbers() {
        int firstNumber = -10;
        int secondNumber = -20;
        int expected = -10;
        int actual = Demo_02_FindMaxNumber.findMaximumNumber(firstNumber, secondNumber);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMixNumbers() {
        int firstNumber = -10;
        int secondNumber = 10;
        int expected = 10;
        int actual = Demo_02_FindMaxNumber.findMaximumNumber(firstNumber, secondNumber);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSameNumbers() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int actual = Demo_02_FindMaxNumber.findMaximumNumber(firstNumber, secondNumber);
        Assert.assertEquals(actual, expected);
    }
}
