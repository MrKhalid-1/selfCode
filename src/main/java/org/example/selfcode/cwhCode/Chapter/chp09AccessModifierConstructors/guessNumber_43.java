package org.example.selfcode.cwhCode.Chapter.chp09AccessModifierConstructors;

/**
 * /*    Create a class Game, which allows a user to play "Guess the Number" game once.
 * Game should have the following methods:
 * Constructor to generate the random number
 * takeUserInput() to take a user input of number
 * isCorrectNumber() to detect whether the number entered by the user is true
 * getter and setter for noOfGuesses
 * Use properties such as noOfGuesses(int), etc to get this task done!
 */

import java.util.Random;
import java.util.Scanner;

public class guessNumber_43 {
    public static void main(String[] args) {
        System.out.println("Please select a number between 1 and 9:");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(1, 10);

        while (true) {
            int number = scanner.nextInt();
            if (number <= 0 || number > 9) {
                System.out.println("Number is either less than or equal to 0, or greater than 9. Try again:");
                continue;
            }
            if (randomNumber == number) {
                System.out.println("You win!! The correct number was: " + randomNumber);
                break;
            } else {
                System.out.println("Wrong guess, please choose another number:");
            }
        }
        scanner.close();
    }
}
