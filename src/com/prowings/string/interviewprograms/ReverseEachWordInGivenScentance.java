package com.prowings.string.interviewprograms;

import java.util.Scanner;

public class ReverseEachWordInGivenScentance {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a scentance : ");
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		System.out.println("Given scentence is : "+ sentence);
		
		String reversedWordsSentense = reverseWords(sentence);
		
		System.out.println("Sentence with reversed words : "+reversedWordsSentense);
		
	}

	public static String reverseWords(String sentence) {
		
		//step1 : split given sentence
		String[] words = sentence.split(" ");
		String sentenceWithRevesedWords = "";
		for(String word : words)
		{
			String reversedWord = new StringBuilder(word).reverse().toString();
			sentenceWithRevesedWords = sentenceWithRevesedWords + " " +reversedWord;
		}
		
		return sentenceWithRevesedWords;
	}

}
