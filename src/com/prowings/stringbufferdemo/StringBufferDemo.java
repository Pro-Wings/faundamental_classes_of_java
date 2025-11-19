package com.prowings.stringbufferdemo;

public class StringBufferDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println("Length of sb1 : "+sb1.length());
		
		sb1.trimToSize();
		
		System.out.println("Capacity of sb1 : "+sb1.capacity());
		
		System.out.println("original sb1 : "+sb1);
		
		sb1.append("world");
		
		System.out.println("after modification sb1 : "+sb1);
		
		System.out.println("main method ended!!");
		
	}

}
