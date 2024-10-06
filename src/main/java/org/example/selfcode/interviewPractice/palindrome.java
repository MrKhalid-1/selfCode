package org.example.selfcode.interviewPractice;

public class palindrome {
    public static void main(String[] args) {
        String s = "12321";
        System.out.println(palindrome(s));
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
