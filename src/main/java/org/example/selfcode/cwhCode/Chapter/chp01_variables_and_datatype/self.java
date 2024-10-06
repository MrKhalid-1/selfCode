package org.example.selfcode.cwhCode.Chapter.chp01_variables_and_datatype;

import java.util.Scanner;

public class self {
    public static void main(String[] arr) {
        System.out.println("khalid where are you bro");

        // Write a program to calculate the percentage of a given student in
        // the CBSE board exam. His marks from 5 subjects must be taken as
        // input from the keyboard. (Marks are out of 100)
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int t = a + b + c + d + e;
        int percent = (t * 100) / 500;
        System.out.println(percent);
        sc.close();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (char l : chars) {
            System.out.println(l);
        }
        scanner.close();
    }

}
