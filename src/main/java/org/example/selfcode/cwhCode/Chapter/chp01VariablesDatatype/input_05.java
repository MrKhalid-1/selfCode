package org.example.selfcode.cwhCode.Chapter.chp01VariablesDatatype;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// TODO = In Java, input refers to the process of taking data or values from an external source
//                 (like the user, a file, or a network) and using it in your program.

public class input_05 {

   public static void main(String[] args) throws IOException {
//       Types of Input in Java
 //TODO       1. Standard Input (User Input) : Using Scanner Class:

               Scanner scanner = new Scanner(System.in);

               System.out.print("Enter your name: ");
               String name = scanner.nextLine(); // Reads a line of text.

               System.out.print("Enter your age: ");
               int age = scanner.nextInt(); // Reads an integer.

               System.out.println("Hello, " + name + ". You are " + age + " years old.");


 //TODO        Using BufferedReader Class: (in class need IO exception
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter your name: ");
               String name1 = reader.readLine();

               System.out.print("Enter your age: ");
               int age1 = Integer.parseInt(reader.readLine());

               System.out.println("Hello, " + name + ". You are " + age + " years old.");

           }
    /**
     * TODO Summary :
     * Input Type	Key Classes/Methods	Example
     * User Input	Scanner, BufferedReader, Console	Reading from the console.
     * File Input	FileReader, BufferedReader, Scanner	Reading from a text file.
     * Network Input	Socket, BufferedReader	Reading from a network stream.
     * Command-Line Arguments	Command-line arguments array (args[])	Passing arguments at runtime.
     */

}
