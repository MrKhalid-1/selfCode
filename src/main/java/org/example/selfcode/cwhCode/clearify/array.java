package org.example.selfcode.cwhCode.clearify;

public class array {
    


    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0]  =242;
        marks[1]  =225;
        marks[2]  =224;
        marks[3]  =262;
        marks[4]  =272;
        // System.out.println(marks[3]);

        
        // for(int i = 0; i<marks.length;i++){
        //     System.out.println(marks[i]);

        // }  


        // int[] mark = {12,23,45,67,76};
        // System.out.println(mark[0]);
        // System.out.println(marks[0]);

        for(int i = marks.length-1; i>=0;i--){
            // System.out.println(marks[i]);

        }  

        // 2d array
        int[][] flats = new int[3][4];
        flats[0][0] = 98;
        flats[0][1] = 443;
        flats[0][2] =  455;
        flats[0][3] =44585;
        flats[1][0] = 989;
        flats[1][1] = 4433;
        flats[1][2] =  4525;
        flats[1][3] =44515;
        flats[2][0] = 1298;
        flats[2][1] = 4431;
        flats[2][2] =  4525;
        flats[2][3] =44535;
        // System.out.println(flats.length);

        // System.out.println(flats[0].length);
                
        for(int i = 0; i<flats.length;i++){
            for(int j=0; j<flats[i].length;j++){
                System.out.println(flats[i][j] + " " );
        }


        }  
        // System.out.println(flats.length);
        // 1 2 3 4 
        // 5 6 7 8 
        // 9 10 11 12 
        // 13 14 15 16 
    }}
    

    


