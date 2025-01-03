package org.example.selfcode.cwhCode.Chapter.chp14ErrorAndException;
import java.io.*;
/*
        int   a = 9  // No semicolon, syntax errors!
        a =   a + 3;
        d = 4; // Variable not declared, syntax
 */


public class errorAndException_78 {
    public static void main(String[] args) {
        String filepath = null;
        try {
            FileInputStream file = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            System.out.println("Caught an exception: " + e);
        }  catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e);
        }

    }
    public void myMethod() throws IOException {
        throw new IOException("Exception message");
    }

}
