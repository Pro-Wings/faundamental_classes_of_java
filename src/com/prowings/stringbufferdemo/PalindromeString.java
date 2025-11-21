package com.prowings.stringbufferdemo;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String input = "Radar";
		
		if(isPalindrome(input))
			System.out.println("Given string is Palindrome!!!");
		else
			System.out.println("Given string is Not Palindrome!!!");
			
		
		System.out.println("main method ended!!");
		
	}

	public static boolean isPalindrome(String input)
	{
		System.out.println("Received String : "+input);
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String reversedStr = sb.toString();
		System.out.println("Reversed String: "+reversedStr);
		if(input.equalsIgnoreCase(reversedStr))
			return true;
		else
			return false;
		
	}
	
}
