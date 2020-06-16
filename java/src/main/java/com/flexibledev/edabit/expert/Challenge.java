package com.flexibledev.edabit.expert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Challenge
 */
public class Challenge {

    private Challenge() {
    }

    /**
     * Title : English to Pig Latin Translator Link :
     * https://edabit.com/challenge/6dEDvruWbEDqXb7dk
     */
    static final int[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };

    public static String translateWord(String word) {
        StringBuilder bufNotVowels = new StringBuilder();
        StringBuilder result = new StringBuilder();
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
        StringBuilder result = new StringBuilder();
        Pattern wordPattern = Pattern.compile("([^a-zA-Z]*)([a-zA-Z]*)([^a-zA-Z]*)");

        for (String word : sentence.split(" ")) {
            Matcher matchPattern = wordPattern.matcher(word);
            if (!matchPattern.find())
                continue;

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
     * Title : Bell Number Link : https://edabit.com/challenge/Rarq6J9wR8FsN2qQ4
     */
    public static int bell(int n) {
        return 0;
    }

    /**
     * Connecting Words
     * 
     * @see https://edabit.com/challenge/zZCARMRzJ2sHLbgwe
     * @param letters
     * @return
     */
    public static String[] join(String[] letters) {
        int minCount = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letters.length - 1; i++) {
            String l1 = letters[i];
            String l2 = letters[i + 1];
            String changed = l1;
            int tmpMaxCount = 0;

            for (int j = 0; j < l2.length(); j++) {
                String tmp = l2.substring(0, l2.length() - j);
                String replaced = l1.replaceAll(tmp + "+$", "");
                int replacedLen = l1.length() - replaced.length();
                if (replacedLen > tmpMaxCount) {
                    tmpMaxCount = replacedLen;
                    changed = replaced;
                }
            }

            if (tmpMaxCount < minCount) {
                minCount = tmpMaxCount;
            }

            sb.append(changed);
        }

        sb.append(letters[letters.length - 1]);

        return new String[] { sb.toString(), String.valueOf(minCount) };
    }
}