package com.flexibledev.edabit;

/**
 * Program
 */
public class Program {

    public static String nameShuffle(String s) {
        StringBuilder builder = new StringBuilder();
        String[] names = s.split(" ");
        for (int i = 0; i < names.length; i++) {
            if (i != 0) builder.append(" ");

            builder.append(names[names.length - i - 1]);
        }

        return builder.toString();
    }

    public static int countWords(String s) {
        return (int)s.chars().filter(c -> Character.isWhitespace(c)).count() + 1;
	}
}