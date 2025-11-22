package com.prowings.string.interviewprograms;

public class PalindromeString2 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String input = "RADAR";
		
		if(isPalindrome(input))
			System.out.println("Given string is Palindrome!!!");
		else
			System.out.println("Given string is Not Palindrome!!!");
			
		
		System.out.println("main method ended!!");
		
	}

	public static boolean isPalindrome(String input)
	{
		return input.equals(new StringBuilder(input).reverse().toString()) ? true : false;
	}
	
}
