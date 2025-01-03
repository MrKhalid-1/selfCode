package org.example.selfcode.cwhCode.Chapter.chp07Method;

/**
 * Recursion is a concept where a method calls itself to solve a problem.
 */
public class recursion_34 {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product;
        }
    }

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(n - 1);
        }
    }

public static void main(String[] args) {
    int x = 0;
    int s = 10;
    printFibonacci(s);
    System.out.println("The value of factorial x is: " + factorial(x));
    System.out.println("The value of factorial x is: " + factorial_iterative(x));
}
}

// class recursion {
//     static void fun2(int n){
//         if(n>0){
//             fun2(n-1);
//             System.out.println(n);
//         }
// }
// public static void main(String[] args){
//         int n = 3;
//         fun2(n);
// }
// }


// class recursion {
//     static void fun1(int n){
//         if(n>0){
//             System.out.println(n);
//             fun1(n-1);
//         }
// }
// public static void main(String[] args){
//         int n = 3;
//         fun1(n);
// }
// }


// public static void main(String[] arr){
// int a = 0;
// int b = 1;
// int c = 0;
// System.out.println(a );
// System.out.println( b);


// for(int i=2;i<10;i++){
//    c = a +b;
//    System.out.println(c);

//    a = b;
//    b = c;


// }



