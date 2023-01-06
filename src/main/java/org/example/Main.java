package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> regexArray = new ArrayList<>();
    private static ArrayList<String> guessArray = new ArrayList<>();

    public static void main(String[] args) {

        int lives = 5;

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

        while (lives >= 0) {

            System.out.println("Pick a letter:");
            String letter = input.next();

            for (int i = 0; i < regexArray.size(); i++) {
                System.out.println("Pick a letter:");
                regexArray.add(letter);
                String replaceWord = randomWord.replaceAll("[^" + regexArray + "]", "_");
                System.out.println(replaceWord);
            }
        }


    }
}