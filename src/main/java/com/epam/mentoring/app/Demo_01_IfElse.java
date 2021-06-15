package com.epam.mentoring.app;

public class Demo_01_IfElse {
    public static void main(String[] args) {
        int i = 9;
        if (i % 2 == 0) {
            System.out.println(i + " is an even number");

        } else {
            System.out.println(i + " is an odd number");
        }

        // Demonstration of Ternary operator
        String message = (i % 2 == 0) ? " is even number" : " is odd number";
        message = i + message;
        System.out.println(message);
    }
}
