package com.prowings.stringclass;

public class StringMethodsDemo3 {
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "helloworld";
		
		//startsWith
		if(s1.startsWith("hello"))
			System.out.println("VALID!!!");
		else
			System.out.println("INVALID!!");
		
		
		System.out.println("-------------------------");
		
		//endswith
		if(s1.endsWith("world"))
			System.out.println("valid string to process!!");
		else
			System.out.println("Invalid string to process!!");
		
		
		System.out.println("main method ended!!");
		
	}

}
