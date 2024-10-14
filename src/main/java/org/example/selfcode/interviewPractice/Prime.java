package org.example.selfcode.interviewPractice;

import java.util.Scanner;
public  class Prime {

    public void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int n = 2; n * n <= number; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime primeChecker = new Prime();
        primeChecker.checkPrime();
    }
}