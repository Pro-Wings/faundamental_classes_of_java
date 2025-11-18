package com.prowings.stringclass;

public class CaseMethodsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "HELLO";
		String s = "hello";
		System.out.println("original :"+s);

		s = s.toUpperCase();
		
		System.out.println("after toUpperCase :"+s);
		
//		s = s.intern();
		
		System.out.println("s == s1  : "+(s == s1));
		
		System.out.println("main method ended!!");
		
	}

}
