package org.java8.features;

@FunctionalInterface
interface Motorcycle {
	public int calculateGear(int gear);
}

public class LamdaExpressionExample3 {
	public static void main(String[] args) {
		Motorcycle bike = (gear) -> {
			return gear * 5;
			};
		System.out.println(bike.calculateGear(7));

	}
}
