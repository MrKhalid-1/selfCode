package org.example.selfcode.interviewPractice;

public class removeSpaces {
    public static void main(String[] args) {
    String s = "k h a l i d";
    char[] chars = s.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for(char d :chars){
        if(!Character.isWhitespace(d)) {
            stringBuilder.append(d);
        }
    }
        System.out.println(stringBuilder.toString());

//  2.
    String a = "kow";
    String d = "kow";
    System.out.println(a==d);

//  3.
        String q = "  abc  def";

//        q = q.strip();
        q = q.trim();

        System.out.println(q);

    }
}

