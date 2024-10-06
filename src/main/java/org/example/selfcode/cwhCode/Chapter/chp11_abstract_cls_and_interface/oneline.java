package org.example.selfcode.cwhCode.Chapter.chp11_abstract_cls_and_interface;

//
//
//abstract class productlist {
//    abstract String name();
//    abstract int s(int d);
//    static void staticMethod() {
//        System.out.println("This is a static method in an abstract class.");
//    }
//    public void num(int e){
//        System.out.println(e + e + ": is the number of we get");
//    }
//}
//abstract class sona  {
//    abstract String name1();
//    static void staticMethod() {
//        System.out.println("This is a static method in an abstract class.");
//    }
//    public void num(int e){
//        System.out.println(e + e + ": is the number of we get");
//    }
//}
//class hum extends productlist{
//
//    @Override
//    public String  name() {
//       return "hum hai yum";
//    }
//
//    @Override
//    int s(int d) {
//        return d;
//    }
//}
//class uie extends hum{
//
//}
//// Interface
//interface Drawable {
//    void draw();
//    default void sor(int d){
//        System.out.println(d);
//    }
//    static void sore(int d){
//        System.out.println(d);
//    }
//}
// class Circle implements Drawable {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a circle.");
//    }
//
//}
// class Rectangle implements Drawable {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a rectangle.");
//    }
//}
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("khalid");
    }

    @Override
    public void methodB() {
        System.out.println("method b is running");
        // Implementation
    }
}
// class R implements A ,B { // Compilation error: Cannot have multiple
// inheritance
// @Override
// void methodA() {
// System.out.println("Method A");
// }

// @Override
// void methodB() {
// System.out.println("Method B");
// }
// }
// public class oneline {
// public static void main(String[] args) {
// R obj = new R();
// obj.methodA();
// obj.methodB();
// }
// }

public class oneline {
    public static void main(String[] args) {
        C c = new C();
        c.methodB();
        c.methodA();

        // hum hum = new hum();
        //// productlist.staticMethod();
        //// System.out.println(hum.name());
        //// hum.staticMethod();
        //// hum.num(45);
        //// hum.s(4);
        //// System.out.println(hum.s(455));
        // Circle circle = new Circle();
        // circle.draw();
        // circle.sor(4);
        //// Drawable.sor(4) -- its give error
        // Rectangle rectangle = new Rectangle();
        // rectangle.draw();
        // rectangle.sor(46);
        //// rectangle.sore(34); -- its give error because static method use only
        //// interface
        // Drawable.sore(44);

        // productlist p = new hum();
        // p.name();

    }
}
