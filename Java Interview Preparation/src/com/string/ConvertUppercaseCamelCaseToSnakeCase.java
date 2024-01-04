package com.string;

public class ConvertUppercaseCamelCaseToSnakeCase {

	public static void main(String[] args) {
		String str = "WhatIsYourName";
		String regex = "([a-z])([A-Z])";
		String replacement = "$1_$2";
		
		String temp = str.replaceAll(regex, replacement).toUpperCase();
		System.out.println(temp);

	}

}
