package org.example.selfcode.interviewPractice;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Integer a = i.nextInt();
        System.out.println(isodd(a));
    }

    public static Boolean isodd(Integer a){
        if(a%2 == 2){
            return false;
        }
        else {
            return true;
        }
    }
}
