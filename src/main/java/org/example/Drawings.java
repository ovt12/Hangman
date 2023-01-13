package org.example;

// THIS DOESN'T MAKE SENSE TO EXTEND GAME AS YOU DON'T USE ANY OF ITS FUNCTIONALITY
// YOU ONLY NEED lives
// IF YOU NEED TO ACCESS lives JUST PASS IT IN AS A PARAMETER TO YOUR hangmanImage METHOD
public class Drawings {
    // YOU WILL NEED TO ADD IT TO THE PARAMETERS AS WELL SEE BELOW
    public static void hangmanImage(int lives) {
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
