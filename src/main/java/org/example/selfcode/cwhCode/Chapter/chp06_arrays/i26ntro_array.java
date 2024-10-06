package org.example.selfcode.cwhCode.Chapter.chp06_arrays;


//it is a collection of simillier dataype
public class i26ntro_array {
    /* marks[0] = 100       //Note that index starts from 0
marks[1] = 70
// .                                  
// .
// marks[4] = 98 */

// marks.length //Gives 5 if marks is a reference to an array with 5 elements

// for (int i=0; i<marks.length; i++)
// {
//             Sout(marks[i]);    //Array Traversal
// }
    

    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
    }

}
