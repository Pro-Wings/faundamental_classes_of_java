package com.prowings.copyconstructor.deep;

public class TestShalloCopyConstructor {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		System.out.println("....Creating original Library object....");
		
		Library lib1 = new Library(101, "City Library", "Java Programming");
		
		System.out.println("Original Library Object : " + lib1);
		
		Library lib2 = new Library(lib1); //invoking copy constructor
		
		System.out.println("Copied Library Object : " + lib2);
		
	}

}
