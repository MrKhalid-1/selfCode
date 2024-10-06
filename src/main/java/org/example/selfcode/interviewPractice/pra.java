package org.example.selfcode.interviewPractice;

import java.util.Scanner;

public class pra {
//    If  is odd, print Weird
//    If  is even and in the inclusive range of  to , print Not Weird
//    If  is even and in the inclusive range of  to , print Weird
//    If  is even and greater than , print Not Weird
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Integer n = scanner.nextInt();
        for(int i = 1 ; i<=10; i++ ){
            System.out.println(n + "*" + i  + "=" +  n*i);
        }
    }
}
