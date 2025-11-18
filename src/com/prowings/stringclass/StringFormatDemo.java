package com.prowings.stringclass;

public class StringFormatDemo {
	public static void main(String[] args) {
		
		
		//%s = String  %d = digits %f = floating point vals
		
		String s = String.format("Name is: %s and Age is : %d and he achived %f marks", "Vaibhav", 25, 99.5f);
		System.out.println(s);
		
		String result = String.format("|%40s|", "Java");
		
		System.out.println(result);
		
		
	}

}
