package org.example.selfcode.interviewPractice;

import static java.lang.System.out;

public class reversestring {

    public static void main(String[] args) {
        String str = "khalid";
        out.println("me hlina");
        out.println(revers(str));
    }

    public static String revers(String in) {
        if (in == null) {
            out.println("string is the null");
            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = in.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        }
    }

    public void String(){
        String s = "khalid";
        String W = "tuam";
        StringBuilder t = new StringBuilder();
        t.append(s).append(W);
        System.out.println(t);
    }
}
