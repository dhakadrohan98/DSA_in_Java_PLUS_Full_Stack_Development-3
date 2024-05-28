package org.java8.features;

interface NumericalMaths {
	public double calculateCircumference(double r);
}

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		NumericalMaths numericalMaths = (r) -> {
			return 2*3.1413*r;
		};
		double radius = 2.1;
		System.out.println(numericalMaths.calculateCircumference(2.1));
	}
}
