package com.prowings.copyconstructor.shallow;

public class TestShalloCopyConstructor {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		System.out.println("....Creating original Library object....");
		
		Book book1 = new Book(201, "Java Programming");
		Library lib1 = new Library(101, "City Library", book1);
		System.out.println("Original Library Object : " + lib1);
		
		//cloning the lib1 object
		Library lib2 = new Library(lib1); //invoking copy constructor
		System.out.println("Copied Library Object : " + lib2);
		
		System.out.println("-------change check before modifying copied object-------");
		
		lib2.getBook1().setBookName("Python Programming");
		
		System.out.println("After modifying bookName of Book object in Copied Library Object");
		System.out.println("Original Library Object : " + lib1);
		System.out.println("Copied Library Object : " + lib2);
		
	}

}
