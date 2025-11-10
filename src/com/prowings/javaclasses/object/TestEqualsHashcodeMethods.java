package com.prowings.javaclasses.object;

import java.util.HashSet;

public class TestEqualsHashcodeMethods {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(101, "Java Basics", "John Doe");
		Book b2 = new Book(101, "Java Basics", "John Doe");
		
		System.out.println("b1 hashcode : "+b1.hashCode());
		System.out.println("b2 hashcode : "+b2.hashCode());
		System.out.println("b1 equals b2 : "+b1.equals(b2));

		System.out.println(b1);
		System.out.println(b2);
		
		
	}

}
