package com.epam.mentoring.app;

public class IfElsegrades {
    public static void main(String[] args) {
        int i=80;
        if(i>85)
        {
            System.out.println("S");

        }
        else if(i<=85 && i>75)
        {
            System.out.println("A");
        }
        else if(i<=75 && i>60)
        {
            System.out.println("B");
        }
        else if(i<=60 && i>50)
        {
            System.out.println("C");
        }
        else if(i<=50 && i>=40)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("fail");
        }

    }
}
