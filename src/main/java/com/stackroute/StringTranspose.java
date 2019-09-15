package com.stackroute;

//This program transposes the given string
public class StringTranspose {

    public String transpose(String input){
        String transpose="";
        String[] str_split = input.split(" ");
        for (String s : str_split) {
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            transpose = transpose + str.toString() + " ";
        }
        return transpose.trim();
    }
}
