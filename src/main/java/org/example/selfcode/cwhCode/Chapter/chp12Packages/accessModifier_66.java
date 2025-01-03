package org.example.selfcode.cwhCode.Chapter.chp12Packages;

/**
 * Access Modifiers in Java
 * Access modifiers determine whether other classes can use a particular field or invoke a
 particular method can be public, private, protected, or default ( no modifier ). See the table given below :

 * AccessModifier	withinClass	    withinPackage	  outsidePackageBySubclassOnly	outside package
 * public	             Y	              Y                       	Y	                Y
 * protect               Y                Y	                        Y	                N
 * Default               Y                Y	                        N	                N
 * private	             Y	              N	                        N	                N
 */

class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

    public static void main(String[] args) {
//        C1 c1 = new C1();
//        System.out.println();
    }
}

public class accessModifier_66 {

    public static void main(String[] args) {
        C1 c = new C1();
         c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//         System.out.println(c.a);
    }
}
