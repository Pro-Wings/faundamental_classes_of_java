package com.prowings.copyconstructor.shallow2;

public class Car {
	
	private int carId;
	private String company;
	private Engine engine;
	
	public Car() {

	}
	
	public Car(int carId, String company, Engine engine) {
		super();
		this.carId = carId;
		this.company = company;
		this.engine = engine;
	}

	
	//copy constructor
	public Car(Car originalCar)
	{
		this.carId = originalCar.carId;
		this.company = originalCar.company;
		//shallow copy - just reference copied
//		this.engine = originalCar.engine;
		
		//Deep copy - create new engine and assign it to cloned car
		Engine engineCopy = new Engine();
		engineCopy.setEngineId(originalCar.getEngine().getEngineId());
		engineCopy.setEngineType(originalCar.getEngine().getEngineType());
		
		this.engine = engineCopy;
		
	}
	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", company=" + company + ", engine=" + engine + "]";
	}
	
	
	
	

}
