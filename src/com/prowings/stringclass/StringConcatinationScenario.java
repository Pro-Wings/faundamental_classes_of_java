package com.prowings.stringclass;

public class StringConcatinationScenario {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String s1 = 10+20+"hello";
		System.out.println(s1);

		String s2 = "hello"+10+20;
		System.out.println(s2);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		String result = String.join(" ", "Java", "Spring", "Microservices");
		System.out.println(result);
		
		
		System.out.println("main method ended!!");
		
	}


}
