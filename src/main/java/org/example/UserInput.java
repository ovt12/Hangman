package org.example;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public String getUserInput(){
        return input.nextLine().toLowerCase(Locale.ROOT);
    }
}
