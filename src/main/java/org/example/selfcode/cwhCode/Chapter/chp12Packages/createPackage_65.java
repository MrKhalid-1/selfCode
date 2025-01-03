package org.example.selfcode.cwhCode.Chapter.chp12Packages;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * How to create a package in Java :
 * javac -d . Harry java
 * The above code creates a packages folder.
 * java Harry java
 */
public class createPackage_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}
