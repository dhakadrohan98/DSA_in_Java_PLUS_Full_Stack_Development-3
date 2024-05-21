package com.PreDirectorRound;

public class ConvertStringIntoSnakeUpperCase {

	public static void main(String[] args) {
		String str = "whatIsYourName";
		String regex = "([a-z])([A-Z])";
		String replacement = "$1_$2";
//		String replacement1 = "$1	";
//		name = name.replaceAll(regex, replacement1);
		
		str = str.replaceAll(regex, replacement).toUpperCase();
		System.out.println(str);
		
		String str1 = "whatIsYourName";
		str1 = str1.replaceAll(regex, replacement);
		System.out.println(str1);

	}

}
