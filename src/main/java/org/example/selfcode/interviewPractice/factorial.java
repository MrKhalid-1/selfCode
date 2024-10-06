package org.example.selfcode.interviewPractice;

public class factorial {
//        int fact = 1;
//        int n = 5;
//        for(int i = 1 ; i<=n; i++){
//            int temp = fact*i;
//            fact = temp;
//            System.out.println(temp);
//        }


//        int fact = 1;
//        int n = 5;
//        for(int i = 5 ; i>0; i--){
//            int temp = fact*i;
//            fact = temp;
//            System.out.println(temp);
//        }


//0 1  1 2 3 5 8 13 21 . ...

    public static void main(String[] args) {
//        int n = 6;
//        for(int i = 1 ; i<n; i++){
//            for(int j = n ; j>i; j--){
//                System.out.print("J");
//            }
//            for (int k = 1; k <= 2*i -1; k++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }
        int size = 6;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i*2-1 ; k++  ){
                    if(k == 1 || k == 2*i -1 || i == size){
                System.out.print("4");
            }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
