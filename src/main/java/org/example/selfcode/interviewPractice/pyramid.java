package org.example.selfcode.interviewPractice;

public class pyramid {
    public static void main(String[] args) {
/*
    *
   ***
  *****
 *******
*********
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2*i -1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
 */

        /*
        2. Hollow Star Pyramid Pattern
    *
   * *
  *   *
 *     *
*********
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2*i -1; k++) {
                if(k == 1 || k == 2*i -1 || i == size)
                    System.out.print("3");
                else
                    System.out.print(" ");
            }
                System.out.println();

        }

         */
        /*
        3. Inverted Star Pyramid Pattern
*********
 *******
  *****
   ***
    *
        for (int i = 1; i <= size; i++) {
            // first inner loop for spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("$");
            }
            // second inner loop print star
            for (int k = 1; k <= 2 * (size - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /*
         Inverted Hollow Star Pyramid Pattern
*********
 *     *
  *   *
   * *
    *
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("$");
            }
            for (int k = 1; k <=2 * (size - i) + 1 ; k++) {
                if(k==1 || k==2 * (size - i) + 1|| i==1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */

        /*
        5. Number Pyramid Pattern
    1
   123
  12345
 1234567
123456789
         */
        int size = 7;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (size - i); k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

    }
}