package com.coding.practice;

public class ConvertCamelCaseToSankeCase {

	public static void main(String[] args) {
		String name="rohan_Dhakad_rohan";
		
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
//		String replacement1 = "$1	";
//		name = name.replaceAll(regex, replacement1);
		
		String name1 = name.replaceAll(regex, replacement).toLowerCase();
		System.out.println(name1);
		
		String name2 = name.replaceAll(regex, replacement).toUpperCase();
		System.out.println(name2);
		System.out.println("Original String: " + name);

	}

}
