package com.stackroute;

import java.util.regex.Pattern;

public class FindPresence {

    public boolean findPresence(String str){
        String pattern = ".*Harry.*";
        return Pattern.matches(pattern, str);
    }
}
