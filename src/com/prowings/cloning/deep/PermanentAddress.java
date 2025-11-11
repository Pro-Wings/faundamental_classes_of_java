package com.prowings.cloning.deep;

public class PermanentAddress implements Cloneable {
	
	private int pincode;
	private String street;
	private String city;
	
	public PermanentAddress() 
	{
	
	}

	public PermanentAddress(int pincode, String street, String city) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PermanentAddress [pincode=" + pincode + ", street=" + street + ", city=" + city + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
}
