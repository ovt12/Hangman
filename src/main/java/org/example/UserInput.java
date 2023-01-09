package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> regexArray = new ArrayList<>();
    static ArrayList<String> guessArray = new ArrayList<>();
    public static int lives = 5;


    public static void startGame() {
        String randomWord = Words.randomWord().toLowerCase();
        guessArray.clear();
        regexArray.clear();
        lives = 5;
        String replaceWord = "";
        while (lives >= 1 && !replaceWord.equals(randomWord)) {

            System.out.println("Pick a letter: ");
            String letter = input.next();
            Results.correctInput(letter);
            letter = letter.toLowerCase();

            if (randomWord.contains(letter)) {
                regexArray.add(letter);
                replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
                System.out.println("Lives: " + lives);
                System.out.println(replaceWord);
                Results.displayGuesses(guessArray);
            } else {
                lives -= 1;
                guessArray.add(letter);
                System.out.println("You guessed wrong! Try Again!");
                Drawings.hangmanImage();
                System.out.println("Lives: " + lives);
                System.out.println(replaceWord);
                Results.displayGuesses(guessArray);

            }
        }
        Results.lostResult(randomWord);
    }



    }

