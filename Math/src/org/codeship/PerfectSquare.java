package org.codeship;

public class PerfectSquare {

	public static void main(String[] args) {
		int n1 = 325; //not a perfect square.
		double sqrt = Math.sqrt(n1);
		System.out.println(sqrt);
		System.err.println(sqrt - Math.floor(sqrt) == 0);
		System.out.println();
		
		int n2 = 324; //a perfect square.
		sqrt = Math.sqrt(n2);
		System.out.println(sqrt);
		System.err.println(sqrt - Math.floor(sqrt) == 0);

	}

}
