package com.prowings.stringbufferdemo;

public class String_StrinBuffer_Builder_Conversion {

	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s = "hello";
		
		reverseString(s);
		
		System.out.println("main method ended!!");
		
	}
	
	
	public static String reverseString(String original)
	{
		
		System.out.println("received original String : "+original);
		
		StringBuilder sb = new StringBuilder(original);
		
		String reversedStr = sb.toString();
		
		System.out.println("Reversed String : "+reversedStr);
		
		return reversedStr;
		
	}
	
}
