package com.prowings.stringclass;

public class StringMethodsScenario2 {
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = "helloworld";
	
		String s3 = s1.substring(5,5);

		System.out.println(s3);
		System.out.println(s3.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println("-----------------------");
		
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("Reference Eq str1 == str2 : "+(str1 == str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("equals : "+ (str1.equals(str2)));
		
		
		String str3 = new String("hello");
		String str4 = new String("hello");

		System.out.println("Reference Eq str3 == str4 : "+(str3 == str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println("equals : "+ (str3.equals(str4)));

		
		System.out.println("=============================");
		
		String st1 = "hello";
		String st2 = "HELLO";
		
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(st1.equalsIgnoreCase(st2));
		
		System.out.println(st2);
		System.out.println(st2.toLowerCase());

		System.out.println(st1.toUpperCase());
		
		System.out.println("main method ended!!");
		
	}

}
