package com.stackroute;

//program to count total number of occurrences of a given character in a string without using loops

public class CountCharacter {
    private long frequency;
    public long countOccurences(String str, char ch){

        frequency = str.chars().filter(c -> c==ch).count();
        return frequency;
    }
}
