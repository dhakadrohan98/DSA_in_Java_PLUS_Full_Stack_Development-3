package org.java8.features;

@FunctionalInterface
interface Functional {
	public double calculatePi(double pi, int k);
}

public class LamdaExpression1 {

	public static void main(String[] args) {
		
		Functional functional = (p, k) -> 
		{
			System.out.println("p value: "+p);
			System.out.println("hello, world");
			System.out.println("Value of K: " + k);
			return p * 2;
		};
		double calculatePi = functional.calculatePi(3.1416, 7);
		System.out.println(calculatePi);

	}

}
