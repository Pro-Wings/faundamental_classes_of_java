package com.prowings.javaclasses.object;

class Car
{
	
	
	public boolean equals(Object o)
	{
		System.out.println("inside Car's equals method!!");
		return false;
	}

	public static void main(String[] args)
	{
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1.equals(car2));
		
	}

}
