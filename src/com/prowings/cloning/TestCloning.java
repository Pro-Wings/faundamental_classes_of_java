package com.prowings.cloning;

public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("main method started!!");
		
		Employee e1 = new Employee(101, "John Doe", "123 Main St", 55000.0);
		
//		Employee e2 = e1;

//		Employee e2 = new Employee(101, "John Doe", "123 Main St", 55000.0);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Hascode of e1 = " + e1.hashCode());
		System.out.println("Hascode of e2 = " + e2.hashCode());
		
		System.out.println("Employee 1 = " + e1);
		System.out.println("Employee 2 = " + e2);
		
		
		System.out.println("---------APPRIASAL DONE----------");
		
		e2.setEmpSalary(e2.getEmpSalary() + 7000.0);
		e1.setEmpAddress("456 M G Road");
		
		
		System.out.println("after appriasal Employee 1 = " + e1);
		System.out.println("after appriasal Employee 2 = " + e2);
		
		System.out.println("main method ended!!");
		
	}


}
