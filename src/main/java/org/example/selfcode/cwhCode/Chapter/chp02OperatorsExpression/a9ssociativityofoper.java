package org.example.selfcode.cwhCode.Chapter.chp02OperatorsExpression;

public class a9ssociativityofoper {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        if (x == y) {
    System.out.println(x);
        }
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
}



