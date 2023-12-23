package com.programiz;


//this is functional interface
@FunctionalInterface
interface MyInterface{
 // abstract method
 double getPiValue(int num);
}

public class Main {

	public static void main(String[] args) {
		 // declare a reference to MyInterface
	    MyInterface ref;
	    
	    // passing an argument in lambda expression.
	    ref = (num) -> {
	    	double pi = 3.1415 + num;
	    	return pi;
	    };
	    
	    System.out.println("Value of Pi = " + ref.getPiValue(2));

	}

}
