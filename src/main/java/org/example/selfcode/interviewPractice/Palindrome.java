package org.example.selfcode.interviewPractice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "12321";
//        System.out.println(palindrome(s));
    String  str = "A Plalp a";
        String cleaned = str.replaceAll("[\\W]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println(cleaned.equals(reversed));
        System.out.println(cleaned);
    }

    public static boolean palindrome(String s){
        Integer left = 0;
        Integer right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
