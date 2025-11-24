package com.prowings.string.interviewprograms;

public class WordCharCountFromGivenString {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String input = "India is my country India is beautiful";
		
		wordAndCharCount(input);
		
		System.out.println("main method ended!!");
		
	}

	public static void wordAndCharCount(String input) {
		String[] words = input.split(" ");
		System.out.println("Number of words : "+words.length);
		int charCount = 0;
		for(String word : words)
			charCount += word.length();
		System.out.println("Number of characters excluding space : "+charCount);
		System.out.println("Number of characters including space : "+input.length());
	}

}
