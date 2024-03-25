package com.recusrion.striver;

public class FactorialOfNum {

	private static int fact(int num) {
		//base case
		if(num == 0) return 1;
		return num * fact(num-1);
	}
	public static void main(String[] args) {
		int num = 5;
		System.out.println(fact(5));

	}

}
