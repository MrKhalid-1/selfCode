package org.example.selfcode.cwhCode.Chapter.chp08_intro_opps.example;

/*
    Interface Example
    An interface in Java is a reference type, similar to a class, that can contain only constants,
    method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance
    fields or constructors.

    Here's an example to illustrate:
 */

interface Animal {
    void sound(); // Interface method (does not have a body)

    void eat();   // Interface method (does not have a body)

}

class Dog implements Animal {
    // Provide implementation for the interface methods
    public void sound() {
        System.out.println("The dog barks.");
    }

    public void eat() {
        System.out.println("The dog eats food.");
    }
}

class sui implements Animal {
    // Provide implementation for the interface methods
    public void sound() {
        System.out.println("The dog barks.");
    }

    public void eat() {
        System.out.println("The dog eats food.");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: The dog barks.
        dog.eat();   // Output: The dog eats food.
    }
}


/*
    In this example:

    Animal is an interface with two method signatures: sound() and eat().
    Dog implements the Animal interface and provides implementations for both methods.
    In the Main class, we create an object of Dog and call its methods.
    Using abstraction, you can define a blueprint (abstract class or interface) and create multiple
    classes that implement this blueprint, each with their own specific implementations. This helps in
    managing complexity and makes your code more modular and easier to maintain.
 */