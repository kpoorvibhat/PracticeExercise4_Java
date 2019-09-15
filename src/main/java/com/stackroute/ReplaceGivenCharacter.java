package com.stackroute;


//This program replaces all d with f
//and all l with t in the given string

public class ReplaceGivenCharacter {
    public String replaceDAndL(String str) {
        String str1 = str.replace('d', 'f');
        return str1.replace('l', 't');
    }
}
