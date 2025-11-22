package com.prowings.string.interviewprograms;

import java.util.Arrays;

public class AnagramStringEx {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		String input1 = "ababab";
		String input2 = "aababbb";

		if (isAnagram(input1, input2))
			System.out.println("Given strings are anagram!!!");
		else
			System.out.println("Given strings are not anagram!!!");

		System.out.println("main method ended!!");

	}

	public static boolean isAnagram(String input1, String input2) {

		// step1: check Strings lengths - if not equal, no need to check for anagram
		if (input1.length() != input2.length()) {
			System.out.println("since lengths are not equal, no need to check for anagram!!!");
			return false;
		}

		// step2: convert given strings into char array
		char[] chars1 = input1.toCharArray();
		char[] chars2 = input2.toCharArray();

		// step3: sort both arrays
		Arrays.sort(chars1);
		Arrays.sort(chars2);

		// Step 4: check the equality of both sorted arrays
		boolean res = false;

		for (int i = 0; i < chars1.length; i++) {
			if (chars1[i] != chars2[i])
				break;
			else {
				res = true;
				continue;
			}
		}
		return res;
	}

}
