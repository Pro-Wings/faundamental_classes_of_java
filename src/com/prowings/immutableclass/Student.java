package com.prowings.immutableclass;

public final class Student {
	
	private final int rollNumber;
	private final String name;
//	private final String address;
	private final Address address;

	public Student(int rollNumber, String name, Address address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
//		this.address = address;
		Address addrCopy = new Address();
		addrCopy.setPin(address.getPin());
		addrCopy.setCity(address.getCity());
		this.address = addrCopy;
	}

	public int getRollNumber() {
		return rollNumber;
	}


	public String getName() {
		return name;
	}

	public Address getAddress() {
		
		Address dummyAddr = new Address();
		dummyAddr.setPin(address.getPin());
		dummyAddr.setCity(address.getCity());
		return dummyAddr;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
