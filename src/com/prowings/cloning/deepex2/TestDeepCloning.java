package com.prowings.cloning.deepex2;

public class TestDeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println("main method started!!");
		
		System.out.println("....Creating original Car object....");
		
		Engine engine1 = new Engine(201, "V8");
		
		Car car1 = new Car(101, "BMW", engine1);
		System.out.println("Original Car Object : " + car1);
		
		Car car2 = (Car) car1.clone();
		System.out.println("Cloned Car Object : " + car2);
		
		
//		System.out.println("Hashcode of Original Car Object : " + car1.hashCode());
//		System.out.println("Hashcode of Cloned Car Object : " + car2.hashCode());
//		
//		System.out.println("Hashcode of car.name in Original Car Object : " + car1.getCompany().hashCode());
//		System.out.println("Hashcode of car.name in Cloned Car Object : " + car2.getCompany().hashCode());
//		
//		System.out.println("Reference equality check of car1.company and car2.company: " + (car1.getCompany() == car2.getCompany()));
//		
//		
		System.out.println("Hashcode of car.engine in Original Car Object : " + car1.getEngine().hashCode());
		System.out.println("Hashcode of car.engine in Cloned Car Object : " + car2.getEngine().hashCode());

		System.out.println("Reference equality check of car1.engine and car2.engine: " + (car1.getEngine() == car2.getEngine()));
//		
//		System.out.println("Reference equality check of car1 and car2: " + (car1 == car2));
		
		System.out.println("=================MODIFYING CLONED OBJECT=================");

		car2.setCarId(102);
		
		System.out.println("After modifying carId of cloned Car Object");

		car2.setCompany("Audi");
		System.out.println("After modifying company of cloned Car Object");
		
		car2.getEngine().setEngineType("V6");
		System.out.println("After modifying engine (mutable field) of cloned Car Object");
		
		
		System.out.println("Original Car Object : " + car1);
		System.out.println("Cloned Car Object : " + car2);
		System.out.println("main method ended!!");
		
	}

}
