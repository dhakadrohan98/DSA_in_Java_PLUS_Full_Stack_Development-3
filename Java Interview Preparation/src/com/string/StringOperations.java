package com.string;

public class StringOperations {

	public static void main(String[] args) {
		String str = "Rohan";
		str.concat(" Dhakad");
		System.out.println("Is immutable? " + str);
		
		
		str = str.concat(" Dhakad");
		System.out.println("Is immutable? So assign it explicitly: " + str);

	}

}
