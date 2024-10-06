package org.example.selfcode.interviewPractice;

import java.lang.reflect.Array;

public class vowels {
    public static void main(String[] args) {

        String s = "khalid";
        char[] chars = s.toCharArray();
        char[] chars1 = {'a', 'e', 'i', 'o', 'u'};
        for(char c : chars){
            for(char d:chars1){
                if(c == d){
                    System.out.println("yes in it");
                }
            };
        }

        String m = "naksum";
        StringBuilder stringBuilder = new StringBuilder();
        char [] chars2 = m.toCharArray();
        for(int i = chars2.length-1 ; i>=0; i--){
            stringBuilder.append(chars2[i]);
        }
        System.out.println(stringBuilder);
//        for(char c : chars2){
//            System.out.println(c);
//        }
    }
}
