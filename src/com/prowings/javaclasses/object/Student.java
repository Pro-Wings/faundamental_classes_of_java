package com.prowings.javaclasses.object;

import java.util.Objects;

public class Student {
	
	private int rollNumber;
	private String name;
	private String address;

	public Student() {
		super();
	}

	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name)
				&& rollNumber == other.rollNumber;
	}


//	public boolean equals(Object obj)
//	{
//		if(obj == null)
//			return false;
//		
//		if (this.getClass() != obj.getClass())
//			return false;
//		
//		if (this == obj)
//			return true;
//		
//		Student s2 = (Student)obj;
//		
//		if((this.rollNumber == s2.rollNumber) && (this.name.equals(s2.name)) && (this.address.equals(s2.address)))
//			return true;
//		else
//			return false;
//		
//	}
	
	
	
}
