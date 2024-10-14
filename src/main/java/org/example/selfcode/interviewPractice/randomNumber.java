package org.example.selfcode.interviewPractice;

import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int khan = random.nextInt(90) + 10000;
//        int khann=  random.nextInt(344545);
        System.out.println(khan);
    }
}
