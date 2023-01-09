package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Results extends Main {

    private static Scanner input = new Scanner(System.in);

    public static void displayGuesses(ArrayList<String> guessArray) {
        System.out.println("Your guesses so far: " + guessArray);
    }

    public static void correctInput(String letter) {
        if (letter.length() > 1) {
            System.out.println("Please pick just ONE letter!!");
            UserInput.startGame();
        };
    }

    public static void restartGame() {
        System.out.println("Would you like the play again? y = Yes / n = No");
        String answer = input.next();
        answer = answer.toLowerCase();
        if (answer.equals("y")) {
            UserInput.startGame();
        } else {
            System.out.println("Thank you for playing!");
        }
    }

    public static void lostResult(String randomWord) {
        if (UserInput.lives < 1) {
            System.out.println("UNLUCKY! YOU HAVE LOST!");
            System.out.println("The Word was: " + randomWord);
            restartGame();
        } else {
            System.out.println("CONGRATULATION!! YOU HAVE WON!!");
            restartGame();
        }


    }
};
