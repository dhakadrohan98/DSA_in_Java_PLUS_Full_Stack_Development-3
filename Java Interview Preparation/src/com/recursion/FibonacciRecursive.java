package com.recursion;

import java.util.Scanner;

public class FibonacciRecursive {

	public static int fibRecusrion(int num) {
		
		if(num == 0) {
			return num;
		} else if(num == 1) {
			return num;
		}
		int res = fibRecusrion(num-1)+fibRecusrion(num-2);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			int fibo = fibRecusrion(i);
			System.out.print(fibo+", ");
		}
		
		

	}

}
