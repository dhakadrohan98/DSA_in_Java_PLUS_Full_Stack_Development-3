package org.java8.features;

interface Functional {
	public double calculatePi(double pi);
}

public class Java8 {

	public static void main(String[] args) {
		
		Functional functional = (p) -> 
		{
			System.out.println("p value: "+p);
			System.out.println("hello, world");
			return p * 2;
		};
		double calculatePi = functional.calculatePi(3.1416);
		System.out.println(calculatePi);

	}

}
