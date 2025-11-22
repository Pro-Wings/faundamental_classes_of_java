package com.prowings.string.interviewprograms;

public class StringTrickySc1 {
	
	public static void main(String[] args) {
		
		String s1 = "helloworld";
		String s2 = "hello" + "world";

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		
		
		String str1 = "helloworld";
//		String str2 = "hello" + "world";
//		String str2 = "hello".concat("world");
		String str2 = "hello";
		String str3 = "world";
		String str4 = str2 + str3;
		
		System.out.println("str1 = "+str1);
		System.out.println("str4 = "+str4);
		
		System.out.println(str1 == str4);
		
		System.out.println("---------------------------");
		
		String x = null;
		System.out.println(x+"hello");
		
		System.out.println(x.concat("hello"));
	}

}
