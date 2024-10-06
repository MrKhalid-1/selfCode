package org.example.selfcode.interviewPractice;

import static java.lang.System.out;

public class reversestring {
    public static void main(String[] args) {
        String m = "khalid";
        StringBuilder stringBuilder = new StringBuilder();
        char [] mm =m.toCharArray();
        int u = mm.length;
        for (int e = u-1; e>=0;e--){
            out.println(mm[e]);
            stringBuilder.append(mm[e]);
        }
        out.println(stringBuilder);

    }
}

//    public static void main(String[] args) {
//        String str = "khalid";
//        out.println("me hlina");
//        out.println(reversestring(str));
//    }
//
//    public static String reversestring(String in) {
//        if (in == null) {
//            out.println("string is the null");
//            return "";
//        } else {
//            StringBuilder stringBuilder = new StringBuilder();
//            char[] chars = in.toCharArray();
//            for (int i = chars.length - 1; i >= 0; i--) {
//                stringBuilder.append(chars[i]);
//            }
//            return stringBuilder.toString();
//        }
//    }
//
//    public void String(){
//        String s = "khalid";
//        String W = "tuam";
//        StringBuilder t = new StringBuilder();
//        t.append(s).append(W);
//        System.out.println(t);
//    }
//}
