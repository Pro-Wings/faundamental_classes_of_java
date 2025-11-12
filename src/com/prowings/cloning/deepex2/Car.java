package com.prowings.cloning.deepex2;

public class Car implements Cloneable {
	
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

	@Override
	protected Object clone() throws CloneNotSupportedException {

		//		return super.clone();  //this is shallow cloning
		
		//below code is for deep cloning
		Engine clonedEngine = (Engine) this.engine.clone(); //clone engine object
		Car clonedCar = (Car) super.clone(); // clone car object
		clonedCar.setEngine(clonedEngine); // set cloned engine to cloned car object
		return clonedCar; // return cloned car object
	}
	
	
	
}
