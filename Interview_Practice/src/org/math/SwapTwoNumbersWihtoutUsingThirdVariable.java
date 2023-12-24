package org.math;

public class SwapTwoNumbersWihtoutUsingThirdVariable {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		
		num1 = num1+num2; // num1 = 13;
		num2 = num1 - num2; // num2 = 13-8 = 5
		num1 = num1 - num2;
		
		System.out.println(num1+": "+ num2);

	}

}
