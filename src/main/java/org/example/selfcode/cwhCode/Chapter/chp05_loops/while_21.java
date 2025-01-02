package org.example.selfcode.cwhCode.Chapter.chp05_loops;

public class while_21 {

    /**

        int i =4;
        while (Boolean condition){
            // Statements    -> This keeps executing as long as the condition is true.
            // logic
        }
 */
    /**
     *       int i=19;
     *       while(i>0){
     *         System.out.println(i);
     *          i--;
     *       }
     *
     */

    public static void main(String[] args) {
//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }

        int i = 100;
        while(i<=200){
            System.out.println(i);
            i+=20;
        }
        System.out.println("Finish Running While Loop!");


    }
}
