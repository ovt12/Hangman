package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class copy {

        private static Scanner input = new Scanner(System.in);
        private static ArrayList<String> regexArray = new ArrayList<>();
        private static ArrayList<String> guessArray = new ArrayList<>();

    public static void startGame() {
        int lives = 5;
        Boolean state = true;
        String randomWord = Words.randomWord().toLowerCase();

        while (lives >= 1 && !isGameWon(randomWord)) {
            String letter = getUserGuess();

            if (isGuessCorrect(randomWord, letter)) {
                updateRegexArray(letter, randomWord);

            } else {
                updateGuessArray(letter);
                displayIncorrectGuess(lives);
            }
        }
        displayGameOver();
    }

    private static String getUserGuess() {
        System.out.println("Pick a letter: ");
        return input.next();
    }

    private static boolean isGuessCorrect(String randomWord, String letter) {
        return randomWord.contains(letter);
    }

    private static void updateRegexArray(String letter, String randomWord) {
        regexArray.add(letter);
        String replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
        System.out.println(replaceWord);
    }

//    private static void displayCorrectGuess(String randomWord) {
//        String replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
//        System.out.println(replaceWord);
//    }

    private static void updateGuessArray(String letter) {
        guessArray.add(letter);
    }

    private static void displayIncorrectGuess(int lives) {
        lives--;
        System.out.println("You guessed wrong! Try Again!");
        System.out.println("Lives: " + lives);
        System.out.println(guessArray);
    }

    private static boolean isGameWon(String randomWord) {
        String replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
        return replaceWord.equals(randomWord);
    }


    private static void displayGameOver() {
        System.out.println("You loose");
    }
}

