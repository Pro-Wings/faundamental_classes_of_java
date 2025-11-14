package com.prowings.reflection.basics;

public class ClassMetadataEx {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Class<?> primitiveInt = int.class;
		System.out.println(primitiveInt.getName());

		Class<?> voidClass = void.class;
		System.out.println(voidClass.getName());
				
		
		
		System.out.println("main method ended!!");
	}

}
