package com.prowings.stringclass;

public class StringImmutabilityCheck {

	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "helloworld";
		
		System.out.println("Reference Equality of s1 == s2 : "+(s1==s2));
		
		System.out.println("Before s1 = "+s1);
		System.out.println("Before s2 = "+s2);
		
		s1 = s1.concat("world");

		System.out.println("After s1 = "+s1);
		System.out.println("After s2 = "+s2);
		
		
		System.out.println("s3 = "+s3);
		System.out.println("s1 = "+s1);
		
		System.out.println("Reference Equality : "+(s1==s3));
		
		System.out.println("main method ended!!");

	}

}
