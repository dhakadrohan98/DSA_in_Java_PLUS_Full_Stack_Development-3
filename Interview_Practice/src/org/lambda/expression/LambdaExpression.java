package org.lambda.expression;

interface Functional {
	double getPi(double pi);
}

public class LambdaExpression{

	public static void main(String[] args) {
		
		Functional functional;
		float reading = 1.4f;
		System.out.println(reading * 2);
		
		functional = (pi) -> { 
			return pi*2;
		};
		
		System.out.println(functional.getPi(3.1412));
		
		
	}

}
