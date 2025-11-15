package com.prowings.stringclass;

public class StringDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String s1 = new String("Hello"); //new keyword - object will be stored in heap - but outside of SCP
		System.out.println("s1 : "+s1);
		
		String s2 = "Hello"; //litrals - - object will be stored in heap - but inside of SCP
		System.out.println("s2 : "+s2);
		
		
		System.out.println("main ended!!");
		
	}

}
