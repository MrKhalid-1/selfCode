package org.example.selfcode.interviewPractice;

public class swapNumber {
    public static void main(String[] args) {
        int a = 56;
        int b = 643;

        System.out.println("a is " + a + " and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}

