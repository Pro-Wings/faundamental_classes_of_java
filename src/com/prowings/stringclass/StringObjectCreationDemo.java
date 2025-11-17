package com.prowings.stringclass;

public class StringObjectCreationDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println("1----Reference Eqialuty of s1 and s2 : "+(s1==s2));
		
		s1 = s1.concat("world");
		
		System.out.println("s1 after concatination : "+s1);
		
		System.out.println("2----Reference Eqialuty of s1 and s2 : "+(s1==s2));
		
		String s4 = new String("helloworld");
		
		System.out.println("s1 : "+s1);
		System.out.println("s4 : "+s4);
		
		System.out.println("reference equality of s1 and s4 : "+(s1 == s4));
		
		System.out.println("main method ended!!");
		
	}

}
