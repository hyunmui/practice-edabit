package com.flexibledev.edabit;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Program
 */
public class Program {

    public static String nameShuffle(String s) {
        StringBuilder builder = new StringBuilder();
        String[] names = s.split(" ");
        for (int i = 0; i < names.length; i++) {
            if (i != 0)
                builder.append(" ");

            builder.append(names[names.length - i - 1]);
        }

        return builder.toString();
    }

    public static int countWords(String s) {
        return (int) s.chars().filter(c -> Character.isWhitespace(c)).count() + 1;
    }

    /**
     * Title : Xs and Os, Nobody Knows
     * https://edabit.com/challenge/bkFqwEP5Gej23didA
     */
    public static boolean getXO(String str) {
        long count_O = str.chars().filter(ch -> ch == 'o' || ch == 'O').count();
        long count_X = str.chars().filter(ch -> ch == 'x' || ch == 'X').count();

        return count_O == count_X;
    }

    /**
     * Title : Array Of Multiples Link :
     * https://edabit.com/challenge/rzpucPyoyEtXPo2BG
     * 
     * @param num
     * @param length
     * @return
     */
    public static int[] arrayOfMultiples(int num, int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = num * (i + 1);
        }
        return result;
    }

    /**
     * Title : Phone Number Formatting Link :
     * https://edabit.com/challenge/sPz2LcPZyAiBHRgwX
     * 
     * @param numbers phone numbers (only 10 length)
     * @return
     */
    public static String formatPhoneNumber(int[] numbers) {
        StringBuffer phoneNumberBuilder = new StringBuffer();

        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    phoneNumberBuilder.append("(");
                    break;
                case 3:
                    phoneNumberBuilder.append(") ");
                    break;
                case 6:
                    phoneNumberBuilder.append("-");
                    break;
                default:
                    break;
            }

            phoneNumberBuilder.append("" + numbers[i]);
        }

        return phoneNumberBuilder.toString();
    }

    /**
     * Is it Time for Milk and Cookies
     * 
     * @see https://edabit.com/challenge/n6bgfrTFfNZt4yWkJ
     * @param date
     * @return boolean
     */
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        return date.get(Calendar.MONTH) == 11 && date.get(Calendar.DAY_OF_MONTH) == 24;
    }

    /**
     * Cumulative Array Sum
     * 
     * @see https://edabit.com/challenge/LmiWWX2kdWn2Z5aZv
     * @param nums
     * @return
     */
    public static int[] cumulativeSum(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i == 0 ? 0 : arr[i - 1]) + nums[i];
        }

        return arr;
    }

    /**
     * Count Ones in Binary Representation of Integer
     * 
     * @see https://edabit.com/challenge/MwYW3sRdZxno5hXAF
     * @param n
     * @return
     */
    public static int countOnes(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }

        return count;
    }
}