package com.prowings.copyconstructor.shallow2;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Engine e1 = new Engine(111, "v12");
		Car originalCar = new Car(10, "Suzuki", e1);
		System.out.println("Original Car : "+originalCar);
		
		Car clonedCar = new Car(originalCar);
		System.out.println("Cloned Car : "+clonedCar);
		
		System.out.println("--------------------------------");
		
		clonedCar.getEngine().setEngineType("Fiat");
		
		System.out.println("Original Car : "+originalCar);
		System.out.println("Cloned Car : "+clonedCar);
		
		System.out.println("main method ended!!");
		
	}

}
