package org.example.selfcode.cwhCode.Chapter.chp05Loops;

public class dowhile_22 {
    /**
     *  do {
     *      //code
     * } while (condition);      //Note this semicolon
     */

    /**
     *  int i=1;
     *  do{
     *       System.out.println(i);
     *        i++;
     *  }while(i<=10);
     */

    public static void main(String[] args) {
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        int b = 10;
        do {
            System.out.println(b);
            b--;
        } while (b > 5);

        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 5);

    }
}


