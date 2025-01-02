package org.example.selfcode.cwhCode.Chapter.chp10Inheritance;

class EkClass {
    int a;

    EkClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int returnNone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class thisAndSuper_47 {
    public static void main(String[] args) {
//        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
     System.out.println(d.getA());
     System.out.println(d.returnNone());
//        System.out.println(e.getA());
    }
}
