package com.stackroute;

//This program sets up a string variable containing a paragraph.
//Extracts words from text and sorts them in alphabetical order
//Returns the sorted list of words


public class SortWordsAlphabetically {
    private String words[];
    public String[] sortWordsAlphabetically(String paragraph){
        words = paragraph.split(" ");
        for (int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if (words[j].compareToIgnoreCase(words[i])<0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
