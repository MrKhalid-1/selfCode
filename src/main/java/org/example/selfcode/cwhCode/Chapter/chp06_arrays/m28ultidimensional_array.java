package org.example.selfcode.cwhCode.Chapter.chp06_arrays;

public class m28ultidimensional_array {
//     int [][] flats = new int[2][3]          //A 2-D array of 2 rows + 3 columns
// }
// flats[0][0] = 100
// flats[0][1] = 101
// flats[0][2] = 102
// // … & so on!
// String[][][] arr = new String [2][3][4]


    public static void main(String[] args) {
        // int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
