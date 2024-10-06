package org.example.selfcode.cwhCode.Chapter.chp08_intro_opps;


import java.lang.reflect.Array;

/*class Employee3{
    private int id;
    String name;
    int salary;

    public void printDetail(){
        System.out.println("my salary is " + " " + salary);}

    public int getId() {
        return  id ;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class self {
    public static void main (String[] arr){
        Employee3 harry = new Employee3(); // Instantiating a new Employee Object
        harry.salary=34;
        harry.printDetail();
        
        harry.setId(89);
        int id = harry.getId();
        System.out.println(id);

    }}
*/
class emoloye {
    int id;
    String name;
    String positon;

    public void printdetails(){
        System.out.println(name+" "+positon);
    }
}
public  class self{
    public static void main(String[] args) {
        emoloye a = new emoloye();
        emoloye sun = new emoloye();

        a.id = 78;
        a.name = "Mr khalid";
        a.positon = "senior engineer";
        a.printdetails();
        sun.id = 12;
        sun.name = "Mr Rit";
        sun.positon = "junior engineer";
        sun.printdetails();
//        System.out.println("khalid");
//        int [] sub = new int[3];
//        sub[0] = 44;
//        sub[1] = 12;
//        sub[2] = 41;
////        System.out.println(sub[1]);
////        for(int i = 0; i<sub.length; i++){
////            System.out.println(sub[i]);
////
////        }
//for(int a :sub){
//    System.out.println(a);
//}

        // int [] marks = new int[5];


    }
}


