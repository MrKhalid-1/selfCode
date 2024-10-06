package org.example.selfcode.cwhCode.Chapter.chp12_packages;
import java.util.Scanner;
//import java.util.*;


    
/* 
How to create a package in Java :
javac -d Harry java 
The above code creates a packages folder.
java Harry java 
*/
public class c65reate_packages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}
