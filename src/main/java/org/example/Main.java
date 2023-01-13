package org.example;


public class Main {
    public static void main(String[] args) {
        // THIS CAN STAY STATIC AS THERE IS ONLY ONE UTILITY METHOD ON IT
        Intro.welcome();

        // REMOVE STATIC CALL -> Game.StartGame();
        // CREATE Game CLASS & STORE IN A VARIABLE
        Game game = new Game();
        // CALL METHOD
        game.startGame();
    }
}


