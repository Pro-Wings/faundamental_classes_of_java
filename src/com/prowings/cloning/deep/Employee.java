package com.prowings.cloning.deep;

public class Employee implements Cloneable{
	
	private int id;
	private String name;
	private PermanentAddress address;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, PermanentAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PermanentAddress getAddress() {
		return address;
	}

	public void setAddress(PermanentAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("--------Inside Employee's Clone method ---------");
		PermanentAddress clonedAdd = (PermanentAddress) address.clone(); //cloning Address object
		Employee clonedEmp = (Employee) super.clone(); //cloning Employee object
		clonedEmp.setAddress(clonedAdd); //setting cloned Address to cloned Employee
		return clonedEmp; //returning cloned Employee object
	}

	
	
	
}
