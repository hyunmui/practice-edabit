package com.flexibledev.edabit;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Challenge {
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
		StringBuffer buffer = new StringBuffer();

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
	public static int equal(int a, int b, int c) {
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
	 * Title : Check Prime 
	 * Link : https://edabit.com/challenge/ePj2zup56kZrRbhDX
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
}
