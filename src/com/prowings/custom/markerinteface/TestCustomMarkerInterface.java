package com.prowings.custom.markerinteface;

public class TestCustomMarkerInterface {
	
	public static void main(String[] args) throws DeleteNotSupportedException {
		
		System.out.println("main method started!!");
		
		Admin admin = new Admin("admin1", "admin@123");
		User user = new User("user1", "user@123");
		
		DeletionManager deletionManager = new DeletionManager();
		
		deletionManager.delete(admin);
		
		System.out.println("main method ended!!");
		
	}

}
