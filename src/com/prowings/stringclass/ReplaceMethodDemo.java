package com.prowings.stringclass;

public class ReplaceMethodDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String str = "helloworld";
		
		System.out.println("Original Str : "+str);
		
		String replacedStr = str.replace('w', 'W');
//		String replacedStr = str.replace("world", "JavaDevelopers");
		
		System.out.println("String after replace : "+replacedStr);
		
		System.out.println("main method ended!!");
		
	}

}
