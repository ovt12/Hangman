package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> regexArray = new ArrayList<>();
    private static ArrayList<String> guessArray = new ArrayList<>();

    public static void main(String[] args) {

        int lives = 5;
        int guess = 5;

        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");
        regexArray.add("");

        String randomWord = Words.randomWord().toLowerCase();
        System.out.println(randomWord);
        String replaceWord = "";


        while (lives >= 1 && !replaceWord.equals(randomWord)) {

            System.out.println("Pick a letter: ");
            String letter = input.next();

            if (randomWord.contains(letter)){
                regexArray.add(letter);
                replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
                System.out.println(replaceWord);
            } else {
                lives -= 1;
                System.out.println("You guessed wrong! Try Again!");
                System.out.println("Lives: " + lives);
            }
        }
        System.out.println("You loose");
    }
}


