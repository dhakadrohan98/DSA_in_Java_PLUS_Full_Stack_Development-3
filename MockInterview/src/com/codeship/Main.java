package com.codeship;

public class Main {
	
	//method overloading
	
	public static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}
	
	public void run() {
		System.out.println("run method called from Main class");
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		
		System.out.println(sum(2,5.4));

	}

}
