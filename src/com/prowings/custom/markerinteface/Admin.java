package com.prowings.custom.markerinteface;

public class Admin {
	
	private String adminName;
	private String adminPassword;

	public Admin(String adminName, String adminPassword) {
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}

}
