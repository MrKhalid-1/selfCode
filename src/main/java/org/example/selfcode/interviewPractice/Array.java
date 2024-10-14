package org.example.selfcode.interviewPractice;

import java.util.Arrays;

/**
 * 1) Java Program to copy all elements of one array into another array
 * 2) Java Program to find the frequency of each element in the array
 * 3) Java Program to left rotate the elements of an array
 * 4) Java Program to print the duplicate elements of an array
 * 5) Java Program to print the elements of an array
 * 6) Java Program to print the elements of an array in reverse order
 * 7) Java Program to print the elements of an array present on even position
 * 8) Java Program to print the elements of an array present on odd position
 * 9) Java Program to print the largest element in an array
 * 10) Java Program to print the smallest element in an array
 * 11) Java Program to print the number of elements present in an array
 * 12) Java Program to print the sum of all the items of the array
 * 13) Java Program to right rotate the elements of an array
 * 14) Java Program to sort the elements of an array in ascending order
 * 15) Java Program to sort the elements of an array in descending order
 * 16) Java Program to Find 3rd Largest Number in an array
 * 17) Java Program to Find 2nd Largest Number in an array
 * 18) Java Program to Find Largest Number in an array
 * 19) Java to Program Find 2nd Smallest Number in an array
 * 20) Java Program to Find Smallest Number in an array
 * 21) Java Program to Remove Duplicate Element in an array
 * 22) Java Program to Print Odd and Even Numbers from an array
 * 23) How to Sort an Array in Java
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 67, 33, 56, 43, 2};
        Array array = new Array();
//        array.copyArray(arr);
//        array.duplicateArray(arr);
//        array.reverseArray(arr);
//        array.sort(arr);
//        array.oddEven(arr);
        array.smallest(arr);

    }


    public void copyArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }

    public void duplicateArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                if (arr[i] != arr[j]) {
                    arr1[j] = arr[i];
                    System.out.println(Arrays.toString(arr1));
//                    System.out.println(arr[i]);
                }
            }
        }
    }

    public void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public String sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return Arrays.toString(arr);
    }

    public void oddEven(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 || arr[i] % 2 == 0) {
                System.out.println("Even numbers  " + arr[i]);
            } else {
                System.out.println("Odd number " + arr[i]);
            }
        }
    }

    public void smallest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[arr.length-1];
//            System.out.println(temp);
            if (arr[i] <= temp) {
                temp = arr[i];
                System.out.println(temp);
            }
        }
    }
}
//    Java Program to find the frequency of each element in the array
//Java Program to print the duplicate elements of an array
//        int[] ar = {1, 2, 2, 3, 4, 5, 5, 3, 2, 2, 2, 2};
//        int d = 0;
//        System.out.println(d);
//        for (int it = 0; it <= ar.length-1; it++) {
//            d = ar[it];
//            if (d == ar[it]) {
//                System.out.println(d);
//            }
//        }
//    }
//}
/**
 * int[] numbers = {5, 3, 8, 1, 2};
 * System.out.println(numbers.length);
 * System.out.println("Original array: " + java.util.Arrays.toString(numbers));
 * for (int i = 0; i < numbers.length - 1; i++) {
 * for (int j = 0; j < numbers.length - 1 - i; j++) {
 * if (numbers[j] > numbers[j + 1]) {
 * int temp = numbers[j];
 * numbers[j] = numbers[j + 1];
 * numbers[j + 1] = temp;
 * }
 * }
 * }
 * System.out.println("Sorted array: " + java.util.Arrays.toString(numbers));
 * }
 */



