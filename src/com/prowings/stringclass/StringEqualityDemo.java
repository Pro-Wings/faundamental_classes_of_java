package com.prowings.stringclass;

public class StringEqualityDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "HELLO";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		
		System.out.println("main ended!!");
		
	}

}
