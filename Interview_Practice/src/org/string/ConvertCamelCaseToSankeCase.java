package org.string;

public class ConvertCamelCaseToSankeCase {

	public static void main(String[] args) {
		String name="rohanDhakadRohan";
		
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
//		String replacement1 = "$1	";
//		name = name.replaceAll(regex, replacement1);
		
		name = name.replaceAll(regex, replacement).toLowerCase();
		System.out.println(name);

	}

}
