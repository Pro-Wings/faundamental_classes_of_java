package com.prowings.stringclass;

public class StringLitralDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String s1 = "Hello";
		String s3 = "World";
		String s4 = "HelloWorld";
		String s5 = s1.concat(s3); //concatination will always create new String - get stored outside of SCP
		System.out.println("s4 == s5 : "+ (s4 == s5));
		
		System.out.println("main ended!!");
		
	}

}
