package com.prowings.cloning.deep;

public class TestDeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("main method started!!");
		
		PermanentAddress pa1 = new PermanentAddress(41121, "S B Road", "Pune");
		
		Employee e1 = new Employee(10, "Ram", pa1);
		
		System.out.println("Employee 1 = " + e1);

		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Employee 2 = " + e2);
		
		System.out.println("Hascode of e1 = " + e1.hashCode());
		System.out.println("Hascode of e2 = " + e2.hashCode());
		
		System.out.println("Hashcode of e1's Address = " + e1.getAddress().hashCode());
		System.out.println("Hashcode of e2's Address = " + e2.getAddress().hashCode());
		
		System.out.println(e1.getAddress() == e2.getAddress());
		
		System.out.println("---------updating address of e2----------");
		
		e2.getAddress().setCity("Mumbai");
		
		System.out.println("Employee 1 = " + e1);
		System.out.println("Employee 2 = " + e2);
		
		System.out.println("================================================");
		
		Employee e3 = (Employee) e1.clone();
		System.out.println("Employee 3 = " + e3);

		Employee e4 = (Employee) e1.clone();
		e4.getAddress().setStreet("M G Road");
		e4.getAddress().setPincode(56001);
		System.out.println("Employee 4 = " + e4);
		
		
		
	}

}
