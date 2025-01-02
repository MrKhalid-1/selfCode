package org.example.selfcode.cwhCode.Chapter.chp08IntroOpps;

//TODO  Constructor in Java: Simple Explanation
/**
 * A constructor is a special method used to initialize objects in Java.
 * It has the same name as the class and is automatically called when an object of the class is created.
 * Constructors are not regular methods; they don't have a return type (not even void).
 */

//TODO  Key Features of a Constructor:
/**
 * Name Matches Class Name: Constructor's name must match the class name.
 * No Return Type: It does not return any value (not even void).
 * Automatically Called: It is called automatically when an object is created.
 * Used for Initialization: Used to set initial values of object properties
 */

//TODO  Summary

/**
 * Constructors are used for initializing objects.
 * Types: Default, Parameterized, and No-Argument.
 * Overloading allows multiple constructors with different parameter lists.
 * The this keyword helps in differentiating variables or chaining constructors.
 * Private constructors restrict object creation and are useful in Singleton Pattern.
 */
class MyClass {
    int value;

    // Constructor chaining using 'this'
    MyClass() {
        this(50);
        System.out.println("No-Argument Constructor Called!");
    }

    MyClass(int value) {
        this.value = value;
        System.out.println("Parameterized Constructor Called with value: " + value);
    }
}

public class constructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
