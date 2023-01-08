package org.example;

import java.util.ArrayList;

public class Results extends Main {

    public static void displayGuesses(ArrayList<String> guessArray) {
        System.out.println("Your guesses so far: " + guessArray);
    }

    public static void correctInput(String letter, String randomWord){
        if (letter.length() > 1) {
            System.out.println("Please pick just ONE letter!!");
            UserInput.startGame();
        } else {
        };
    }

}
