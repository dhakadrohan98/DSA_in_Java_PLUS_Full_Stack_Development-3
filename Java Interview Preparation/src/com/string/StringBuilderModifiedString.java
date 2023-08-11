package com.string;

public class StringBuilderModifiedString {

	public static void main(String[] args) {
		String str = "Rohan Dhakad";
		StringBuilder string = new StringBuilder(str);
		
		string.setCharAt(2, 'e');
		 // Print the modified string
		 System.out.println("Modified String = " + string);
		
	}

}
