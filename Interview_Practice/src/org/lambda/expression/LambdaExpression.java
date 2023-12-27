package org.lambda.expression;

interface Functional {
	public double getPi(double pi);
}

public class LambdaExpression{

	public static void main(String[] args) {
		
		Functional functional = (pi) -> {return 2*pi;};
		System.out.println("Lambda expression implemented: "+ functional.getPi(3.1415));
		
		
	}

}
