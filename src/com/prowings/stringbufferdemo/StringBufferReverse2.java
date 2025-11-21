package com.prowings.stringbufferdemo;

public class StringBufferReverse2 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		reverseString("abcd");
		
		System.out.println("main method ended!!");
		
	}
	
	
	public static String reverseString(String original)
	{
		System.out.println("received original String : " + original);

		char[] chars = original.toCharArray();

		char[] reversedArray = new char[chars.length];
		int index = 0;
		for (int i = chars.length - 1; i < chars.length; i--) {
			System.out.println(chars[i]);
			reversedArray[index] = chars[i];
			index++;
			if (i == 0)
				break;
		}

		String reversedStr = new String(reversedArray);
		System.out.println(reversedStr);
		return reversedStr;

	}


}
