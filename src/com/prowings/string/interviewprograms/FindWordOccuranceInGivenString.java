package com.prowings.string.interviewprograms;

public class FindWordOccuranceInGivenString {

	/*
	 * Write a program to get the occurance/count of each word in given string.
	 * Input: India is my country India is beautiful country Output: India = 2 is =
	 * 2 my = 1 country = 2 beautiful = 1
	 */

	public static void main(String[] args) {

		System.out.println("main method started!!");

		String input = "India is my country India is beautiful country";

		findOccuranceOfEachWord(input);

		System.out.println("main method ended!!");

	}

	public static void findOccuranceOfEachWord(String input) {

		// Step 1: Split string
		String[] words = input.split(" ");

		// Step 2: Create visited array
		boolean[] visited = new boolean[words.length];

		// Step 3: Loop through each word
		for (int i = 0; i < words.length; i++) {
			// If already counted → skip
			if (visited[i]) {
				continue;
			}

			int count = 1; // count current word

			// Step 4: Check for duplicates
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					count++;
					visited[j] = true; // mark duplicate as visited
				}
			}

			// Step 5: Print result for the current word
			System.out.println(words[i] + " = " + count);
		}
	}

}
