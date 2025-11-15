package com.prowings.stringclass;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String s1 = new String("Ram");

		String s2 = new String("Ram");
		
		System.out.println("Reference Equality : "+ (s1 == s2));
		System.out.println("Content equality : "+ (s1.equals(s2)));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("---------------------");
		
		String s3 = "Ram";
		String s4 = "Ram";
		
		s3 = s3.concat("Kumar");
		
		System.out.println("s3 = "+s3);
		System.out.println("s4 = "+s4);
		
		System.out.println("Reference Equality : "+ (s3 == s4));
		
		System.out.println("main ended!!");
		
	}

}
