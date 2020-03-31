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
		int[] scores = {0, 0, 0};

		str.chars().forEach(win -> {
			char w = (char)win;
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
}
