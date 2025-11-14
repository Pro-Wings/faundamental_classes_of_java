package com.prowings.reflection.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("main method started!!");
		
//		Student s1 = new Student(10,"Ram");
		
		Class<Student> stdClass = Student.class;
		
		Constructor<?>[] constructors = stdClass.getDeclaredConstructors();

		Student s1 = null;

		for (Constructor<?> c : constructors) {
		    System.out.println("Constructor of Student : " + c.getName());
		    c.setAccessible(true);   // allow access to private constructor

		    if (c.getParameterCount() == 0) {   // choose no-arg private constructor
		        s1 = (Student) c.newInstance(); // correct approach
		    }
		}

		System.out.println(s1);		
		
		System.out.println("=========================================");
		
		Field[] fields = s1.getClass().getDeclaredFields();
		System.out.println("Student has : " +fields.length+" number of fields!!");
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		
		System.out.println("main method ended!!");
		
	}

}
