package org.java.polymorphism;

class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 5));
		System.out.println(calc.add(1.5, 2.9)); //4.4
		System.out.println(calc.add(3, 5, 8));

	}

}
