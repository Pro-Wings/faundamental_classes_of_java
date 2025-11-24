package com.prowings.string.interviewprograms;

public class SwapStringsWithoutThirdVariable {

	public static void main(String[] args) {

		String a = "Java";
		String b = "Python";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("-----------------------------------");
		
		int x = 10;
		int y = 20;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}

}
