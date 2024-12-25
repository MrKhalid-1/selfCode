package org.example.selfcode.cwhCode.Chapter.chp01VariablesDatatype;

import java.util.Scanner;

public class exercise_06 {

    /**
     * Write a program to calculate the percentage of a given student in the CBSE board exam.
     * His marks from 5 subjects must be taken as
     * input from the keyboard. (Marks are out of 100)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chem = scanner.nextInt();
        int phys = scanner.nextInt();
        int math = scanner.nextInt();
        int hindi = scanner.nextInt();
        int bio = scanner.nextInt();

        int totalNumber = chem + phys + math + hindi + bio;
        float percent = ((float) totalNumber * 100) / 500;
        System.out.println("total percent avg is for one student is :" + percent);
    }

}