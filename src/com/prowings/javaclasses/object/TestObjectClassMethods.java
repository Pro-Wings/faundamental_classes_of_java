package com.prowings.javaclasses.object;

public class TestObjectClassMethods {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Student s1 = new Student(1, "Sham", "MG Road, Pune");
		
		Student s2 = new Student(1, "Ram", "MG Road, Pune");
		
		Integer o = 1209;

		boolean res = s1.equals(s2); // by default compares memory address -> s1 == s2 i.e. reference equality
		System.out.println("Equals method result : "+res);

		System.out.println("Reference Equality : "+ (s1 == s2));
		
		System.out.println("main method ended");
		
		
	}

}
