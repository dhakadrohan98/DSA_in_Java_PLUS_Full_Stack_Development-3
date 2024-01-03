package org.lambda.expression;

interface Functional {
	public double getPi(double x, double y);
}

public class LambdaExpression{

	public static void main(String[] args) {
		
		Functional functional = (x,y) -> {return x+y;};
		System.out.println("Lambda expression implemented: "+ functional.getPi(3.14,2.14));
		
		
	}

}
