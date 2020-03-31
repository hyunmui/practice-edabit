package com.flexibledev.edabit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        String test = "I";

        Pattern wordPattern = Pattern.compile("([^a-zA-Z]*)([a-zA-Z]*)([^a-zA-Z]*)");
        Matcher matcher = wordPattern.matcher(test);
        
        while(matcher.find()) {
            System.out.println(matcher.group(3));
        }
    }
}