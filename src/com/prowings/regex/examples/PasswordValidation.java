package com.prowings.regex.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	
	private static final String STRONG_PWD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		System.out.println("Enter password : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputPwd = sc.nextLine();

		System.out.println("Entered Password : "+inputPwd);
		
		System.out.println(isStrongPassword(inputPwd) ? "Strong Password!!" : "Weak Password!!");
		
		sc.close();
		
		System.out.println("main method ended!!");
		
	}

	
	
	/**
	 * At least
		✔ 8 characters
		✔ 1 uppercase
		✔ 1 lowercase
		✔ 1 digit
		✔ 1 special character
	 * 
	 * @param inputPwd
	 * @return
	 */
	public static boolean isStrongPassword(String inputPwd) {
		Pattern pwdPattern = Pattern.compile(STRONG_PWD_REGEX);
		Matcher pwdMatcher = pwdPattern.matcher(inputPwd);
		return pwdMatcher.matches();
	}

}
