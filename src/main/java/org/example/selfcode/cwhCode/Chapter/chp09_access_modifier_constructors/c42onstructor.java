package org.example.selfcode.cwhCode.Chapter.chp09_access_modifier_constructors;

    /*  
    <class_name>(){
        //code to be executed on the execution of the constructor
        }  
    <class-name>(<data-type> param1, <data-type> param2,......){
        //code to be executed on the invocation of the constructor
        }
    */


    class CWH {
        CWH(){
            System.out.println("This is the default constructor of CWH class.");
        }}

    class Employee {
            // First constructor
            Employee(String s, int i){
                System.out.println("The name of the first employee is : " + s);
                System.out.println("The id of the first employee is : " + i);
            }
            //    Constructor overloaded
            Employee(String s, int i, int salary){
                System.out.println("The name of the second employee is : " + s);
                System.out.println("The id of the second employee is : " + i);
                System.out.println("The salary of second employee is : " + salary);
            }

        }
public class c42onstructor {

        public static void main(String[] args) {
            CWH obj1 = new CWH();
            Employee shubham = new Employee("Shubham",1);
            Employee harry = new Employee("Harry",2,70000);
    
        }
    }
    

    


    
