package com.prowings.regex.examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {
	
	public static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		System.out.println("Enter email : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputEmail = sc.nextLine();
		
		System.out.println("You have entered email : "+inputEmail);
		
		if(isValidEmail(inputEmail))
			System.out.println("You have entered a valid email!!");
		else
			System.out.println("You have entered a invalid email!!");
			
		sc.close();
		System.out.println("main method ended!!");
		
		
	}

	public static boolean isValidEmail(String inputEmail) {
		
		//Step-1: Compile Regex
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        
        //Step-2: Create Matcher on input string
        Matcher emailMatcher = emailPattern.matcher(inputEmail);
        
        //Step-3: Perform match operation
        return emailMatcher.matches();
	}
	

}
