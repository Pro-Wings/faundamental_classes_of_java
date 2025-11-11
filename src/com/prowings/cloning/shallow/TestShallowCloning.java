package com.prowings.cloning.shallow;

public class TestShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("main method started!!");
		
		Address ad1 = new Address(1234, "Delhi", "India");
		Employee e1 = new Employee(10, "Ram", ad1);
		
		System.out.println("Employee 1 = " + e1);

		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Hascode of e1 = " + e1.hashCode());
		System.out.println("Hascode of e2 = " + e2.hashCode());
		
		System.out.println("Employee 2 = " + e2);
		e2.setName("Shyam");
		System.out.println("Employees after updating name of e2 :");
		System.out.println("Employee 1 = " + e1);
		System.out.println("Employee 2 = " + e2);
		
		System.out.println("---------updating address of e2----------");
		e2.getAddress().setCity("Mumbai");
		
		System.out.println("Employee 1 = " + e1);
		System.out.println("Employee 2 = " + e2);
		
		
		System.out.println("main method ended!!");
		
		
	}


}
