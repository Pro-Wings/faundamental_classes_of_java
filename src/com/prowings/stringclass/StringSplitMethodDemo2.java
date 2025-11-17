package com.prowings.stringclass;

public class StringSplitMethodDemo2 {
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		String sentance = "India,is,my,country";
		
		String[] words = sentance.split("");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("main method ended!!");
		
	}

}
