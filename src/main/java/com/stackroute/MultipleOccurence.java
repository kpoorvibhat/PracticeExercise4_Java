package com.stackroute;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurence {
    public ArrayList<int[]> findMultipleOccurences(String str, String word){
        ArrayList<int[]> startEndIndex = new ArrayList<>();

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            startEndIndex.add(new int[]{matcher.start(), matcher.end()});
        }
        return startEndIndex;
    }
}
