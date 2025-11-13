package com.prowings.object.finalizemethod;

public class TestFinalize {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Student std1 = new Student(10, "Ram", "Ayodhya");

		Student std2 = new Student(20, "Shyam", "Pune");
		
		std1 = null;
		
		std2 = null;
		
		//call GC manually
		System.gc();
		
		System.out.println("main method ended!!");
		
	}

}
