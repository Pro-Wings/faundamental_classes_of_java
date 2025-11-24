package com.prowings.string.interviewprograms;

public class CountNumberOfDigitsCharsSpChars {

	// Count letters, digits, special chars from given String.

	public static void main(String[] args) {

		System.out.println("main method started!!");

		String input = "P@ssw0rd#$12";

		countChars(input);

		System.out.println("main method ended!!");
	}

	public static void countChars(String input) {

		char[] chars = input.toCharArray();

		int characterCount = 0;
		int specialCharacterCount = 0;
		int digitCount = 0;

		for (char c : chars) {
			if (Character.isLetter(c))
				characterCount++;
			else if (Character.isDigit(c))
				digitCount++;
			else
				specialCharacterCount++;
		}

		System.out.println("Total number of Characters in given string : "+characterCount);
		System.out.println("Total number of Digits in given string : "+digitCount);
		System.out.println("Total number of SpecialCharacters in given string : "+specialCharacterCount);
		
	}

}
