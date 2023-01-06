package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> regexArray = new ArrayList<>();
    private static ArrayList<String> guessArray = new ArrayList<>();

    public static void startGame() {

        int lives = 5;
        String randomWord = Words.randomWord().toLowerCase();
        String replaceWord = "";

        while (lives >= 1 && !replaceWord.equals(randomWord)) {

            System.out.println("Pick a letter: ");
            String letter = input.next();
            System.out.println(randomWord);

            if (randomWord.contains(letter)) {
                regexArray.add(letter);
                replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
                System.out.println(replaceWord);
            } else {
                lives -= 1;
                guessArray.add(letter);
                System.out.println("You guessed wrong! Try Again!");
                System.out.println("Lives: " + lives);
                System.out.println(guessArray);
            }
        }
        if (lives < 1){
            System.out.println("UNLUCKY! YOU HAVE LOST!");
            System.out.println("The Word was: " + randomWord);

        } else {
            System.out.println("CONGRATULATION!! YOU HAVE WON!!");
        }


    }
    }

