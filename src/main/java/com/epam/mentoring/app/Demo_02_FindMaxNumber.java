package com.epam.mentoring.app;

public class Demo_02_FindMaxNumber {
    public static int findMaximumNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;
        else
            return secondNumber;

//        int bigNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
//        return bigNumber;
    }
}
