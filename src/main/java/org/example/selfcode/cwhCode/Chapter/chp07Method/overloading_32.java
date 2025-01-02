package org.example.selfcode.cwhCode.Chapter.chp07Method;
/**
 * In Java, it is possible for a class to contain two or more methods with the same name but with different parameters.
 *  Such methods are called Overloaded methods.
 *  Method overloading cannot be performed by changing the return type of methods.
 */

public class overloading_32 {

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public int getLost(int a , int b){
        return 43;
    }

    public static void main(String[] args) {
//         tellJoke();
         overloading_32 overloading = new overloading_32();
//         overloading.getLost(3,4);

        // Case 1: Changing the Integer
        int a = 45;
//        change(a);
//        System.out.println("The value of x after running change is: " + a);

        // Case 1: Changing the Array
         int [] marks = {52, 73, 77, 89, 98, 94};
//         change2(marks);
//         System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!
    }
}

// Method overloading is used to increase the readability of the program.
// void foo()
// void foo(int a)	//Overloaded function foo
// int foo(int a, int b)

// By changing the return type :
// In the below example, we've created a class named calculate.
// In the calculate class, we've two methods with the same name i.e. multiply
// These two methods are overloaded because they have the same name but their return is different.
// The return type of 1st method is int while the return type of the other method is double.
// class calculate{
//      int multiply(int a,int b){
//         return a*b;
//     }
//     double multiply(double a,double b){
//          return  a*b;
//     }

// public static void main(String[] args) {

//         calculate obj = new calculate();
//         int c = obj.multiply(5,4);
//         double d = obj.multiply(5.1,4.2);
//         System.out.println("Mutiply method : returns integer : " + c);
//         System.out.println("Mutiply method : returns double : " +  d);

// }
// }

// By changing the number of arguments passed :
// Again, we've created two methods with the same name i.e., multiply
// The return type of both the methods is int.
// But, the first method 2 arguments and the other method accepts 3 arguments.
// Example :
// class calculate{
//      int multiply(int a,int b){
//         return a*b;
//     }
//     int multiply(int a,int b,int c){
//          return  a*b*c;
//     }

// public static void main(String[] args) {

//         calculate obj = new calculate();
//         int c = obj.multiply(5,4);
//         int d = obj.multiply(5,4,3);
//         System.out.println(c);
//         System.out.println(d);

// }
// }