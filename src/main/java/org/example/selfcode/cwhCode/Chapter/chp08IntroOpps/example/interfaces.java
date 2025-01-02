package org.example.selfcode.cwhCode.Chapter.chp08IntroOpps.example;

/*
    Interface Example
    An interface in Java is a reference type, similar to a class, that can contain only constants,
    method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance
    fields or constructors.

    Here's an example to illustrate:
 */

interface Animal {
    void sound(); // Interface method (does not have a body)

    void eat();// Interface method (does not have a body)

}

interface lions{
     void ror();
     void lazy();
}

class Dog implements Animal,lions{
    // Provide implementation for the interface methods
    public void sound() {
        System.out.println("The dog barks.");
    }

    public void eat() {
        System.out.println("The dog eats food.");
    }

    // Provide implementation for the ror method from lions
    public void ror() {
        System.out.println("The lion roars.");
    }

    // Provide implementation for the lazy method from lions
    public void lazy() {
        System.out.println("The lion is lazy.");
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
    public void hear() {
        System.out.println("The dog hear volumes.");
    }
}

public class interfaces {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound(); // Output: The dog barks.
//        dog.eat();   // Output: The dog eats food.

        sui sui = new sui();
        sui.hear();

        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("leran");
            }

            @Override
            public void eat() {
                System.out.println("eating while animals");
            }
        };

        animal.eat();
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