package com.flexibledev.edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Challenge {

    private Challenge() {
    }

    public static boolean sameAscii(String a, String b) {
        return a.chars().sum() == b.chars().sum();
    }

    public static int[] calculateScores(String str) {
        int[] scores = { 0, 0, 0 };

        str.chars().forEach(win -> {
            char w = (char) win;
            if (w == 'A')
                scores[0]++;
            else if (w == 'B')
                scores[1]++;
            else
                scores[2]++;
        });

        return scores;
    }

    public static String sevenBoom(int[] arr) {
        return Arrays.stream(arr).anyMatch(i -> ("" + i).contains("7")) ? "Boom!" : "there is no 7 in the array";
    }

    public static boolean canCapture(String[] rooks) {
        return rooks[0].chars().anyMatch(c -> rooks[1].chars().anyMatch(x -> x == c));
    }

    static final int[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };

    public static int getCount(String str) {
        return (int) str.chars().filter(ch -> {
            for (int i = 0; i < VOWELS.length; i++) {
                if (VOWELS[i] == ch)
                    return true;
            }
            return false;
        }).count();
    }

    /**
     * Title : Difference of Max and Min Numbers in Array Link :
     * https://edabit.com/challenge/hymPkXdhmDQLe87QT
     */
    public static int differenceMaxMin(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return max - min;
    }

    /**
     * Title : Double Letters Link : https://edabit.com/challenge/EaWY5d2pYBckrkAnS
     */
    public static boolean doubleLetters(String word) {
        return word.matches(".*([a-z])\\1.*");
    }

    /**
     * Title : Repeating Letters N Times Link :
     * https://edabit.com/challenge/HDk4PC9w6KPS3X25W
     */
    public static String repeat(String str, int n) {
        StringBuilder buffer = new StringBuilder();

        str.chars().forEach(ch -> {
            for (int i = 0; i < n; i++)
                buffer.append(String.valueOf((char) ch));
        });

        return buffer.toString();
    }

    /**
     * Title : Vowel Replacer Link : https://edabit.com/challenge/iW7rtor54mbFQ2RrZ
     */
    public static String replaceVowels(String str, char ch) {
        return str.replaceAll("[a,e,i,o,u]", new String(new char[] { ch }));
    }

    /**
     * Title : Equality of 3 Values Link :
     * https://edabit.com/challenge/nfc7H9CQFqJp54uEh
     */
    public static int getEquality(int a, int b, int c) {
        int equalCount = a == b ? 2 : 0;

        if (equalCount == 2 && b == c) {
            equalCount = 3;
        } else if (equalCount == 0 && b == c) {
            equalCount = 2;
        } else if (equalCount == 0 && a == c) {
            equalCount = 2;
        }

        return equalCount;
    }

    /**
     * Title : Check Prime Link : https://edabit.com/challenge/ePj2zup56kZrRbhDX
     * 
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Title : Special Arrays Link : https://edabit.com/challenge/YmeiRhzaiR3MCPBiT
     */
    public static boolean isSpecialArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (isEven(i) != isEven(value) || isOdd(i) != isOdd(value))
                return false;
        }

        return true;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Shapes With N Sides
     * 
     * @see https://edabit.com/challenge/odJPfYRD3kSpE45Jf
     * @param n
     * @return
     */
    public static String nSidedShape(int n) {
        String[] shapeNames = { "circle", "semi-circle", "triangle", "square", "pentagon", "hexagon", "heptagon",
                "octagon", "nonagon", "decagon" };

        return shapeNames[n - 1];
    }

    /**
     * Swapping Two by Two
     * 
     * @see https://edabit.com/challenge/Bt6tuyqL7ESZHpsec
     * @param str
     * @return
     */
    public static String swapTwo(String str) {
        StringBuilder buf = new StringBuilder();

        int i = 0;
        for (i = 0; i < str.length() && i + 3 < str.length(); i += 4) {
            buf.append(str.substring(i + 2, i + 3 + 1));
            buf.append(str.substring(i, i + 2));
        }

        if (i != str.length())
            buf.append(str.substring(i, str.length()));

        return buf.toString();
    }

    /**
     * Is the Average of All Elements a Whole Number?
     * 
     * @see https://edabit.com/challenge/yk7GqGcCpFgQrk8fH
     * @param arr
     * @return
     */
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;
        int cutAvg = (int) avg;

        return avg - cutAvg == 0;
    }

    /**
     * 
     * @param str
     * @return
     */
    public static int firstVowel(String str) {
        char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (Character.toLowerCase(str.charAt(i)) == vowels[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int gcd(int n1, int n2) {
        int gcd = Integer.MIN_VALUE;
        for (int commonDivisor = 1; commonDivisor <= Math.min(n1, n2); commonDivisor++) {
            if (n1 % commonDivisor == 0 && n2 % commonDivisor == 0) {
                gcd = commonDivisor;
            }
        }
        return gcd;
    }

    /**
     * Consecutive Number?
     * 
     * @see https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
     * @param arr
     * @return
     */
    public static boolean cons(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Valid Variable Names
     * 
     * @see https://edabit.com/challenge/6gDTBRgZKpotCsgib
     * @param variable
     * @return
     */
    public static boolean variableValid(String variable) {
        return variable.matches("^[a-zA-Z_][a-zA-Z0-9_]*");
    }

    /**
     * Maximum Possible Total
     * 
     * @see https://edabit.com/challenge/TM5f33Mpu52m2jcat
     * @param numbers
     * @return
     */
    public static int maxTotal(int[] numbers) {
        return Arrays.stream(numbers).sorted().skip(5).sum();
    }

    /**
     * Fix the Spacing
     * 
     * @see https://edabit.com/challenge/LJh54oryEc3tkagzD
     * @param sentence
     * @return
     */
    public static String correctSpacing(String sentence) {
        String replaceText = sentence;
        while (true) {
            String tmp = replaceText;
            replaceText = replaceText.replace("  ", " ");

            if (tmp.equals(replaceText))
                break;
        }
        return replaceText.trim();
    }

    /**
     * No Yelling
     * 
     * @see https://edabit.com/challenge/33tRK98geLPcf73PF
     * @param phrase
     * @return
     */
    public static String noYelling(String phrase) {
        return phrase.replaceAll("([!?])+$", "$1");
    }

    /**
     * Find the Smallest and Biggest Numbers
     * 
     * @see https://edabit.com/challenge/J4Yop3GjeZELWeoqT
     * @param arr
     * @return
     */
    public static double[] minMax(double[] arr) {
        double min = Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
        double max = Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);

        return new double[] { min, max };
    }

    /**
     * Say Hello, Say Bye
     * 
     * @see https://edabit.com/challenge/zFccarRuia5zq4rhP
     * @param name
     * @param num
     * @return
     */
    public static String sayHelloBye(String name, int num) {
        return (num == 1 ? "Hello " : "Bye ") + Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

    /**
     * Solving Exponential Equations With Logarithms
     * 
     * @see https://edabit.com/challenge/oB67n674gwdTi33P4
     * @param a
     * @param b
     * @return
     */
    public static int solveForExp(int a, int b) {
        int i = 0;
        int x = 1;
        for (; x < b; i++) {
            x *= a;
        }
        return i;
    }

    /**
     * Convert a Number to Base 2
     * 
     * @see https://edabit.com/challenge/xH7uvX2MoH8e85aYS
     * @param decimal
     * @return
     */
    public static String binary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            sb.insert(0, decimal % 2);
            decimal /= 2;
        }

        return sb.toString();
    }

    /**
     * The Fibonacci Number
     * 
     * @see https://edabit.com/challenge/t3NThQjrcbjhiF5zt
     * @param a
     * @return
     */
    public static int fibonacci(int a) {
        int f0 = 0;
        int f1 = 1;
        int cnt = 0;

        while (cnt != a) {
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            cnt++;
        }

        return f1;
    }

    /**
     * Move Capital Letters to the Front
     * 
     * @see https://edabit.com/challenge/vs7xj6PwALtfpjkmX
     * @param str
     * @return
     */
    public static String capToFront(String str) {
        StringBuilder sb = str.chars().filter(Character::isUpperCase).collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append);
        sb.append(str.chars().filter(Character::isLowerCase).collect(StringBuilder::new, StringBuilder::appendCodePoint,
                StringBuilder::append));

        return sb.toString();
    }

    /**
     * Semantic Versioning
     * 
     * @see https://edabit.com/challenge/H4smHFuL5wn58imFK
     * @param semver
     * @return
     */
    public static String retrieveMajor(String semver) {
        return retrieveVersion(0, semver, semver);
    }

    /**
     * Semantic Versioning
     * 
     * @see https://edabit.com/challenge/H4smHFuL5wn58imFK
     * @param semver
     * @return
     */
    public static String retrieveMinor(String semver) {
        return retrieveVersion(1, semver, "0");
    }

    /**
     * Semantic Versioning
     * 
     * @see https://edabit.com/challenge/H4smHFuL5wn58imFK
     * @param semver
     * @return
     */
    public static String retrievePatch(String semver) {
        return retrieveVersion(2, semver, "0");
    }

    private static String retrieveVersion(int v, String semver, String def) {
        String[] semvers = semver.split("\\.");
        return semvers.length > v ? semvers[v] : def;
    }


    public static boolean isStretched(String str1, String str2) {
        int i = 0;
        while (str1.charAt(i) == str1.charAt(++i));

        String removeRepeat = str1.replaceAll("([\\w]){" + i + "}", "$1");
        
        return removeRepeat.equals(str2);
    }
}
