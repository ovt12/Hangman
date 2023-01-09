package org.example;

public class Drawings extends UserInput {
    public static void hangmanImage() {
        if (lives == 5) {
            System.out.println("__|__");
        }
        if (lives == 4) {
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__");
        }
        if (lives == 3) {
            System.out.println("  ________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|__");
        }
        if (lives == 2) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |      \uD83D\uDC41\uD83D\uDC41");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|__");
        }
        if (lives == 1) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       |");
            System.out.println("  |      _____");
            System.out.println("  |     |\uD83D\uDC41\uD83D\uDC41|");
            System.out.println("  |      |\uD83D\uDC43|");
            System.out.println("  |      |\uD83D\uDC45|");
            System.out.println("__|__");
        }
        if (lives == 0) {
            System.out.println("  ________");
            System.out.println("  |       |");
            System.out.println("  |       |");
            System.out.println("  |      _____");
            System.out.println("  |     |\uD83D\uDC41\uD83D\uDC41|");
            System.out.println("  |      |\uD83D\uDC43|                     UNLUCKY YOU LOST!!");
            System.out.println("  |      |\uD83D\uDC45|");
            System.out.println("  |     --|--");
            System.out.println("  |      | |");
            System.out.println("__|__");
        }
    }
};
