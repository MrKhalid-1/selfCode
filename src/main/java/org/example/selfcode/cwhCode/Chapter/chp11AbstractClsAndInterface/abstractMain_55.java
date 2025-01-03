package org.example.selfcode.cwhCode.Chapter.chp11AbstractClsAndInterface;

//TODO Abstract

/**
 * Abstract Class
 * An abstract class is a class that cannot be instantiated and serves as a blueprint for other classes.
 * It can contain both abstract methods (without implementation) and concrete methods (with implementation) and is
 * used to define shared behavior for related classes.
 *
 */

/**
 * Abstract Method: A method that has no body and ends with a semicolon. It is defined using the abstract keyword.
 * Abstract Class: A class that can contain abstract methods, concrete methods (methods with a body),
 * or both. Abstract classes cannot be instantiated directly.
 * Abstract vs Concrete: Abstract represents incomplete functionality (to be completed by subclasses),
 * while concrete methods provide complete implementations.
 */

// TODO Interfaces in Java

/**
 * An interface in Java is a blueprint of a class that contains only abstract methods (before Java 8) or a combination of
 * abstract methods, default methods, and static methods
 * <p>
 * Definition
 * Interface: A collection of abstract methods and static constants.
 * Interfaces are declared using the interface keyword.
 * A class implements an interface using the implements keyword.
 */


/**
 * 1. static method  are associated with the class, not an instance.
 * 2. abstract me static method main class ke object se bhi call ho SKta hai
 * 3. abstract class in direct method bna skte hai interfaces me nahi
 * 4. its need to declare super name for main class constructor
 */

interface checkAbs {
//    void play() {                            // its giving error
//        System.out.println("this is interface method play");
//    }

    static void played() {
        System.out.println("this is interface static method played");
    }

    default void playing() {
        System.out.println("this is interface default method playing");
    }
}

abstract class checkInherit {
    void check(String name) {
        System.out.println("this is checkInherit class :" + name);
    }
}

abstract class Shape {
    String lion;

    Shape(String name) {
        this.lion = name;
        System.out.println("name");
    }

    Shape() {
        System.out.println("normal constructor for main class");
    }

    abstract void draw();

    void craw() {
        System.out.println("craw main class normal method");
    }

    static void shrap() {
        System.out.println("this is static method in main class");
    }
}

class Circle extends Shape implements checkAbs {
    Circle(String circle) {
        super(circle);   // its need to declare super name for main class constructor
        System.out.println("circle");
    }

    Circle() {
        System.out.println("circle is normal constructor");
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    void normalCircle() {
        System.out.println("this is normal method in normal circle class");
    }
}

public class abstractMain_55 {
    public static void main(String[] args) {
        Shape.shrap();

        Circle circle = new Circle();
        circle.draw();
        circle.craw();
        circle.normalCircle();
        circle.playing();

        Shape shape = new Circle("bigi bili");
        shape.shrap();   // main class ke object se bhi static call ho rha hai
        shape.draw();
        shape.craw();
//        shape.normalCircle();  // :: error because new object circle class ki help se bnaya hai

        checkAbs checkAb = new Circle();
      /*  checkAb.draw();
        checkAb.craw();
        checkAb.normalCircle(); */  // all three give error
        checkAb.playing();

        checkAbs checkAbs1 = new checkAbs() {
            @Override
            public void playing() {
                checkAbs.played();
                checkAbs.super.playing();
            }
        };
        checkAbs1.playing();
    }
}

/*
    Abstract class	Interface

1.  It can contain abstract and non-abstract method	It can only contain abstract methods.
     We do not need to use the "abstract" keyword in interface methods because the interface is implicitly abstract.
    2. abstract keyword is used to declare an abstract class.
    interface keyword is used to declare an interface.
    3.  A sub-class extends the abstract class by using the "extends" keyword.
        The "implements" keyword is used to implement an interface.
    4. A abstract class in Java can have class members like private, protected, etc.
    Members of a Java interface are public by default.
    5. Abstract class doesn't support multiple inheritance.
        Multiple inheritance is achieved in Java by using the interface.
*/