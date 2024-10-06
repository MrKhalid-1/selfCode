package org.example.selfcode.interviewPractice;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.Scanner;

public class prime {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            Integer i = n.nextInt();
            System.out.println(isPrime(i));
        }

        public static boolean isPrime(int n) {
            if (n == 0 || n == 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }
