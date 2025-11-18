package com.prowings.stringclass;

public class InternMethodDemo {
	public static void main(String[] args) {
		
		System.out.println("main method started!");
		
		String s1 = new String("hello");
		
		String s2 = "hello";
		
		s1 = s1.intern(); //refer s1 but from SCP only
		
		System.out.println(s1==s2);
		
		
		System.out.println("main method ended!");
		
	}

}
