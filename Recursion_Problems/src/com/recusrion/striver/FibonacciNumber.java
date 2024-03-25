package com.recusrion.striver;

public class FibonacciNumber {

	private static int func(int num) {
		//base case
		if(num <= 1) return num;
		int last = func(num-1);
		int secondLast = func(num-2);
		return last + secondLast;
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println(func(num));

	}

}
