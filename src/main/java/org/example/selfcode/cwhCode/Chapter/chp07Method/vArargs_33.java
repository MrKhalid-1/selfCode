package org.example.selfcode.cwhCode.Chapter.chp07Method;

/**
 * public void methodName(type... parameterName) {
 * // method body
 * }
 * <p>
 * Rules:
 * The varargs parameter must always be the last one in the method's parameter list.
 * You cannot have multiple varargs parameters in a method.
 */
public class vArargs_33 {
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
    }
}
