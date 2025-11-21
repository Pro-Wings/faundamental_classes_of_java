package com.prowings.stringbufferdemo;

public class StringBufferInbetweenInsrtionAndDeletion {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		StringBuffer sb = new StringBuffer("helloworld");
		
		System.out.println(sb.capacity());

		System.out.println("original sb : "+sb);
		sb.insert(5, '-');
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.delete(0, 5);
		
		System.out.println("after delete : "+sb);
		
		System.out.println("main method ended!!");
		
	}

}
