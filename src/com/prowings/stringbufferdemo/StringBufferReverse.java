package com.prowings.stringbufferdemo;

public class StringBufferReverse {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		StringBuilder sb = new StringBuilder("abcd");
		
		System.out.println("Original sb : "+sb);
		
		sb.reverse();
		
		System.out.println("Reversed sb : "+sb);
		
		System.out.println("main method ended!!");
		
	}

}
