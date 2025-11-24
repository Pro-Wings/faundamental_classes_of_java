package com.prowings.string.interviewprograms;

import java.util.Arrays;

public class FindLongestWordInGivenString {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String input = "India is most beautiful country";
		
		String longestWord = findLongestWord(input);
		
		System.out.println("Longest word from given string is : "+longestWord);
		
		System.out.println("main method ended!!");
		
	}

	public static String findLongestWord(String input) {
		String[] words = input.split(" ");
		String longestWord = words[0];
		for(String w : words)
		{
			if(w.length() > longestWord.length())
				longestWord = w;
		}
		return longestWord;
	}

}
