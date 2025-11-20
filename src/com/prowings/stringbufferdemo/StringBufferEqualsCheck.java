package com.prowings.stringbufferdemo;

public class StringBufferEqualsCheck {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));

//		System.out.println(sb1+sb2);
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1+s2);
		
		System.out.println(s1);
	}

}
