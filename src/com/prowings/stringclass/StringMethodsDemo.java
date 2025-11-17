package com.prowings.stringclass;

public class StringMethodsDemo {
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "helloworld";
		
		int numberOfChars = s1.length();
		System.out.println(numberOfChars);

		char c = s1.charAt(1);
		System.out.println("char at index 1 : "+ c);
		
		
		String s2 = " ";
		System.out.println("isEmpty() : "+s2.isEmpty());
		System.out.println("isBlank() : "+s2.isBlank());
		
		
		String s3 = "helloworld";
		
		System.out.println("original s3 : "+s3);
		
		String s4 = s3.substring(5);
		
		System.out.println("sub string s4 : "+s4);
		
		
		System.out.println("main method ended!!");
		
	}

}
