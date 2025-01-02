package org.example.selfcode.cwhCode.Chapter.chp08IntroOpps;
/***
 * Class:
 *
 * A blueprint for creating objects.
 * Example:
 * class Animal {
 *     String name; // Attribute
 *     void eat() { // Method
 *         System.out.println(name + " is eating.");
 *     }
 * }
 */


/**
 * Object:
 * An instance of a class.
 * Example:
 * public class Main {
 *     public static void main(String[] args) {
 *         Animal dog = new Animal(); // Creating an object
 *         dog.name = "Dog";          // Setting attribute
 *         dog.eat();                 // Calling method
 *     }
 * }
 */

/**
 * Object-Oriented Programming tries to map code instructions with real-world,  making the code short and easier
 * to understand.With the help of OOPs, we try to implement real-world entities such as object, inheritance,
 * abstraction, etc. OOPs helps us to follow the DRY(Don't Repeat Yourself) approach of programming,
 * which in turn increases the reusability of the code.
 * <p>
 * Two most important aspects of OOPs - Classes & Objects :
 * Class :
 * A class is a blueprint for creating objects.
 * Classes do not consume any space in the memory.
 * Objects inherit methods and variables from the class.
 * <p>
 * Objects :
 * An object is an instantiation of a class. When a class is defined, a template (info) is defined.
 * Every object has some address, and it occupies some space in the memory.
 * It is a physical entity.
 * Take a look at the below example to get a better understanding of objects and classes :
 * <p>
 * <p>
 * How to model a problem in OOPs
 * We identify the following:
 * <p>
 * Noun              - Class                        - Employee
 * Adjective        - Attributes                  - name, age, salary
 * Verb               - Methods                    - getSalary(), increment()
 * This is all for this tutorial. We will do a detailed discussion on every aspect of OOPs in further tutorials.
 */
public class introOops36_01 {
    public static void main(String[] args) {
        System.out.println("khalid ");
        int a = 45;
        boolean b = a != 0;
        System.out.println(b);
    }
}
