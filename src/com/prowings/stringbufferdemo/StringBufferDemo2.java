package com.prowings.stringbufferdemo;

public class StringBufferDemo2 {
	
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Capacity of sb1 : "+sb1.capacity());
		System.out.println("Lengthof sb1 before append : "+sb1.length());
		
		sb1.append("abcdefghiabsqwertabcdefghiabsqwerttwe");
		
		System.out.println("Capacity of sb1 after append : "+sb1.capacity());
		
		System.out.println("Lengthof sb1 after append : "+sb1.length());

		System.out.println("main method ended!!");
		
	}

}
