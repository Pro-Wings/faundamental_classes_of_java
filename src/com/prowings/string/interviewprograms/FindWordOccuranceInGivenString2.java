package com.prowings.string.interviewprograms;

import java.util.HashMap;

public class FindWordOccuranceInGivenString2 {

	/*
	 * Write a program to get the occurance/count of each word in given string.
	 * Input: India is my country India is beautiful country Output: India = 2 is =
	 * 2 my = 1 country = 2 beautiful = 1
	 * 
	 * Using Collection - HashMap
	 */

	public static void main(String[] args) {

		System.out.println("main method started!!");

		String input = "India is my country India is beautiful country India country beautiful";

		findOccuranceOfEachWord(input);

		System.out.println("main method ended!!");

	}

	public static void findOccuranceOfEachWord(String input) {

		// Step 1: Split string
		String[] words = input.split(" ");
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		for(String word : words)
		{
			if(!wordCountMap.containsKey(word))
				wordCountMap.put(word, 1);
			else
			{
				int oldVal = wordCountMap.get(word);
				wordCountMap.put(word, oldVal+1);
			}
		}
		System.out.println(wordCountMap);
	}

}
