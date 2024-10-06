package org.example.selfcode.interviewPractice;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practices {
        public static String extractString(String input) {
            // Regular expression to match the required pattern
            String sting= "^[^\\(\\-\\.]+";
            Pattern p = Pattern.compile(sting);
            Matcher m = p.matcher(input);
            if (m.find()){
                return m.group(0).trim();

            }else {
                return  "";
            }
        }

     public Integer divide(int a, int b){
            int c = 45;
            int d = 45;
            int f = 0;
            try{
                f = a+b/0;
            }catch (ArithmeticException e){
                System.out.println("cant devide by zero");
            }
            return f;
        }

        public static void main(String[] args) {
            String s1 = "KALID94(09).JPG";
            String s2 = "IOE4.PNG";

            String result1 = extractString(s1);
            String result2 = extractString(s2);

            System.out.println("Extracted string from s1: " + result1);  // Output: KALID94
            System.out.println("Extracted string from s2: " + result2);  // Output: IOE4

            practices practice = new practices();
            practice.divide(5,9);

        }
    }
