package com.flexibledev.edabit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Expert
 */
public class Expert {

    /**
     * Title : English to Pig Latin Translator
     * Link : https://edabit.com/challenge/6dEDvruWbEDqXb7dk
     */
    static final int[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };

    public static String translateWord(String word) {
        StringBuffer bufNotVowels = new StringBuffer();
        StringBuffer result = new StringBuffer();
        boolean isStartUppercase = false;
        boolean isStartVowels = false;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (i == 0) {
                isStartUppercase = Character.isUpperCase(ch);
                isStartVowels = isVowelCase(ch);
            }

            if (isVowelCase(ch)) {
                result.append(isStartUppercase ? Character.toUpperCase(ch) : ch);
                result.append(word.substring(i + 1, word.length()));
                break;
            } else {
                bufNotVowels.append(Character.toLowerCase(ch));
            }
        }

        if (!word.isEmpty()) {
            result.append(bufNotVowels.toString());
            result.append(isStartVowels ? "yay" : "ay");
        }

        return result.toString();
    }

	public static String translateSentence(String sentence) {
        StringBuffer result = new StringBuffer();
        Pattern wordPattern = Pattern.compile("([^a-zA-Z]*)([a-zA-Z]*)([^a-zA-Z]*)");

        for (String word : sentence.split(" ")) {
            Matcher matchPattern = wordPattern.matcher(word);
            if (!matchPattern.find()) continue;

            result.append(matchPattern.group(1));
            result.append(translateWord(matchPattern.group(2)));
            result.append(matchPattern.group(3));
            result.append(' ');
        }

		return result.toString().trim();
    }

    private static boolean isVowelCase(char ch) {
        for (int i = 0; i < VOWELS.length; i++) {
            if (Character.toLowerCase(ch) == VOWELS[i])
                return true;
        }
        return false;
    }


    /**
     * Title : Bell Number
     * Link : https://edabit.com/challenge/Rarq6J9wR8FsN2qQ4
     */
    public static int bell(int n) {
		return 0;
    }
}