package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private ArrayList<String> regexArray = new ArrayList<>();
    private ArrayList<String> guessArray = new ArrayList<>();
    public int lives = 5;
    private final Results results = new Results();

    public void startGame() {
        String randomWord = Words.randomWord().toLowerCase();
        guessArray.clear();
        regexArray.clear();
        lives = 5;
        String replaceWord = "";
        while (lives >= 1 && !replaceWord.equals(randomWord)) {

            System.out.println("Pick a letter: ");
            String letter = input.next();
            if (!results.correctInput(letter)) {
                continue;
            }
            letter = letter.toLowerCase();

            if (randomWord.contains(letter)) {
                regexArray.add(letter);
                replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
                System.out.println("Lives: " + lives);
                System.out.println(replaceWord);

                results.displayGuesses(guessArray);
            } else {
                lives -= 1;
                guessArray.add(letter);
                System.out.println("You guessed wrong! Try Again!");
                Drawings.hangmanImage(lives);
                System.out.println("Lives: " + lives);
                System.out.println(replaceWord);
                results.displayGuesses(guessArray);

            }
        }
        results.lostResult(randomWord, lives);

        if (results.restartGame()) {
            startGame();
        }
    }
}