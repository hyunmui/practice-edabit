package com.flexibledev.edabit;

import java.util.Arrays;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        String test = "1";
        System.out.println(test.matches("^[^a-zA-Z_].*"));
    }
}