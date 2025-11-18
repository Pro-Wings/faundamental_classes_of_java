package com.prowings.stringclass;

public class TrimMethods {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s = "  hello world   ";
		
		s = s.trim(); //trim method removes leading and trailing spaces if present.
		
		System.out.println("after trim : "+s);
		String res = s.substring(5);
		
		System.out.println(res);
		
		System.out.println("-------------------------------");
		
		String str = "  Hello JavaDevelopers  ";
		
		System.out.println(str);
		
		String strippedStr = str.strip();
		
		System.out.println(strippedStr);
		
		System.out.println("main method ended!!");
		
	}

}
