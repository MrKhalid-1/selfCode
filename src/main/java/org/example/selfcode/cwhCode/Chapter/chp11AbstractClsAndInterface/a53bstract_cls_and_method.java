package org.example.selfcode.cwhCode.Chapter.chp11AbstractClsAndInterface;

/*
public abstract class phone Model {
    abstract void switch off ();
     || more code
     }
*/

abstract class Phone1 {
    abstract void on();
}

class SartPhone1 extends Phone1 {
    void on() {
        System.out.println("phn on ho rha hai htt jao");
    }

    void run() {
        System.out.println("Turning on...");
    }
}


abstract class Parent2 {
    public Parent2() {
        System.out.println("Mai base2 ka constructor hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("I am good");
    }
}

public class a53bstract_cls_and_method {

    public static void main(String[] args) {
        SartPhone1 i = new SartPhone1();
        i.on();
        i.run();


        //Parent2 p = new Parent2(); -- error
//        Child2 c = new Child2();

//        Child3 c3 = new Child3(); -- error
    }
}
