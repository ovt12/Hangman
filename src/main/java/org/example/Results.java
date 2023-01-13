package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// DOESN'T NEED TO EXTEND MAIN
public class Results {
    // REMOVE STATIC
    private Scanner input = new Scanner(System.in);

    // REMOVE STATIC
    public void displayGuesses(ArrayList<String> guessArray) {
        System.out.println("Your guesses so far: " + guessArray);
    }

    // REMOVE STATIC
    public boolean correctInput(String letter) {
        if (letter.length() > 1) {
            System.out.println("Please pick just ONE letter!!");
           return false;
        }
         return true;

    }

    // REMOVE STATIC
    public boolean restartGame() {
        System.out.println("Would you like the play again? y = Yes / n = No");
        String answer = input.next();
        answer = answer.toLowerCase();
        if (answer.equals("y")) {
            return true;
        } else {
            System.out.println("Thank you for playing!");
            return false;
        }
    }

    // REMOVE STATIC
    // PASS IN LIVES
    public void lostResult(String randomWord, int lives) {
        if (lives < 1) {
            System.out.println("UNLUCKY! YOU HAVE LOST!");
            System.out.println("The Word was: " + randomWord);
        } else {
            System.out.println("\uD83C\uDF8A\uD83C\uDF8ACONGRATULATION!! YOU HAVE WON!!\uD83C\uDF8A\uD83C\uDF8A");
        }
       // MOVE WHERE YOU CALL restartGame
    }
};
