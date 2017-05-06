package com.example;

public class JokeProvider {
    private static final String jokes =
            "How many programmers does it take to change a light bulb ? None, that's a hardware problem";

    public static String getJoke(){
        return jokes;
    }
}
