package org.java8.features;

interface Drawaing {
	public void circle(double r);
}

public class LambdaExpression4 {

	public static void main(String[] args) {
		Drawaing obj = (radius) -> {
			System.out.println("Drawing perimter of circle which length is " + (2 * 3.1416 * radius));
		};
		obj.circle(3);

	}

}
