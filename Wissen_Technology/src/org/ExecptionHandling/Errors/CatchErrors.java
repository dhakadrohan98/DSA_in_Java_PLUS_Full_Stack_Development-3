package org.ExecptionHandling.Errors;

public class CatchErrors {

	public static void recurse() {
		recurse();
	}
	public static void main(String[] args) {
		try {
			recurse();
		} catch(StackOverflowError e) {
			System.out.println("caught a StackOverFlow errors");
		}

	}

}
