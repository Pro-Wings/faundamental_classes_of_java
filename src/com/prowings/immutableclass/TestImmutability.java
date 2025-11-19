package com.prowings.immutableclass;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Address addr1 = new Address(4123, "Pune");
		
		Student std1 = new Student(10, "Ram", addr1);
		
		System.out.println("Original Std1 Object : "+std1);
		
//		std1.setRollNumber(20);
//		std1.setName("Shyam");
//		std1.setAddress("Mumbai");
		
		addr1.setCity("Mumbai");
		
		
		std1.getAddress().setCity("Dubai");
		
		System.out.println("Modified Std1 Object : "+std1);

		System.out.println("main method ended!!");
		
	}

}
