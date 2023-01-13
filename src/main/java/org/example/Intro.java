package org.example;

// DOESN'T NEED TO INHERIT FROM MAIN
// - SHOULD NEVER EXTEND MAIN
public class Intro {

    // RENAME METHOD
    // Intro -> welcome
    // CONSTRUCTORS ARE THE SAME NAME AS THE CLASS NO OTHER METHODS
    public static void welcome(){
        System.out.println("_________________WELCOME TO HANGMAN_________________");
        System.out.println(" ");
        System.out.println("Guess the word. 5 lives only. Good Luck!!");
    }
}
