package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Words {

    private static final Random RANDOM = new Random();
    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("hydrological");
        words.add("phylogenetic");
        words.add("troublesome");
        words.add("testosterone");
        words.add("dribbling");
        words.add("compressive");
        words.add("deafness");
        words.add("desktops");
        words.add("windscreen");
        words.add("zookeepers");
    };

    public static String randomWord(){
        int index = RANDOM.nextInt(words.size());
        return words.get(index);
    }

}
