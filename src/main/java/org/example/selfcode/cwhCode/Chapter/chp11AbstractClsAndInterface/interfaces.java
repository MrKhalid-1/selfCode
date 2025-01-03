package org.example.selfcode.cwhCode.Chapter.chp11AbstractClsAndInterface;

/**
 *  * Interface
 *  * An interface is a blueprint that defines a set of abstract methods and constants.
 *  It is used to specify a contract that implementing classes must adhere to, supporting
 *      multiple inheritance and loose coupling between components.
 *
 */
/**
 * Characteristics of Interfaces ( Methods in Interfaces):
 * Abstract Methods: Declared without a body.
 * Default Methods: Introduced in Java 8, they have a body and provide default behavior.
 * Static Methods: Introduced in Java 8, they have a body and are accessed using the interface name.
 * Private Methods: Introduced in Java 9, used as helper methods within the interface.
 * Variables in Interfaces:  All variables are implicitly public, static, and final.
 * Implementation:  A class can implement multiple interfaces, supporting multiple inheritance of behavior.
 * Inheritance in Interfaces: An interface can extend another interface.
 */

/**
 * 1. static method direct we can call with class name and not need to make object kyu ki object bna kr call bhi nhi ho rha
 * 2.Your code is incorrect because interface methods cannot have a body (implementation) in their declaration,
 *              except:  Default methods  ,Static methods.
 */
//TODO  Basic Interface Example
interface Base {
    void cool();

    default void cool1() {
        System.out.println("shared information with cool1");
    }

    static void cool2() {
        System.out.println("shared info with cool2");
    }

    default void def() {
        System.out.println("i am not aware");
    }
}

interface Basic {
    void coolBasic();

    default void coolBased() {
        System.out.println("shared information with coolBased");
    }

    static void coolBasing() {
        System.out.println("shared info with coolBasing");
    }

}

class tesh implements Base,Basic {
    @Override
    public void cool() {
        System.out.println("Base cool in one base");
    }

    @Override
    public void coolBasic() {
        System.out.println("coolBasic override in tesh");
    }

    void deft() {
        System.out.println("i am not aware becuase this is in tesh class");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Base tesh = new tesh();
//        tesh tesh = new tesh();
        tesh.cool1();
        tesh.cool();
//        tesh.cool2(); //error kyu ki method static hai so class naam se direct call hoga
//        base.cool();

        tesh base= new tesh();
        base.deft();

        Base base1 = new tesh();
        base1.def();

    }
}

/**

 Default and Static Methods
 java
 Copy code

 interface Vehicle {
 void start(); // Abstract method

 default void stop() { // Default method
 System.out.println("Vehicle stopped.");
 }

 static void fuel() { // Static method
 System.out.println("Vehicle refueled.");
 }
 }

 class Car implements Vehicle {
@Override public void start() {
System.out.println("Car starts.");
}
}

 public class Main {
 public static void main(String[] args) {
 Vehicle car = new Car();
 car.start();  // Output: Car starts.
 car.stop();   // Output: Vehicle stopped.
 Vehicle.fuel(); // Output: Vehicle refueled.
 }
 }


 Multiple Inheritance with Interfaces
 interface Flyable {
 void fly();
 }

 interface Swimable {
 void swim();
 }

 class Bird implements Flyable, Swimable {
@Override public void fly() {
System.out.println("Bird flies.");
}

@Override public void swim() {
System.out.println("Bird swims.");
}
}

 public class Main {
 public static void main(String[] args) {
 Bird bird = new Bird();
 bird.fly();  // Output: Bird flies.
 bird.swim(); // Output: Bird swims.
 }
 }

 Interface Inheritance
 interface Animal {
 void eat();
 }

 interface Mammal extends Animal {
 void walk();
 }

 class Dog implements Mammal {
@Override public void eat() {
System.out.println("Dog eats.");
}

@Override public void walk() {
System.out.println("Dog walks.");
}
}

 public class Main {
 public static void main(String[] args) {
 Mammal dog = new Dog();
 dog.eat();  // Output: Dog eats.
 dog.walk(); // Output: Dog walks.
 }
 }
 *
 */
