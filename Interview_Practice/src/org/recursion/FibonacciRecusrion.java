package org.recursion;

import java.util.Scanner;

public class FibonacciRecusrion {

	public static int fibRecusrion(int num) {
		
		if(num == 1) {
			return 0;
		} else if(num == 2) {
			return 1;
		}
		int res = fibRecusrion(num-1)+fibRecusrion(num-2);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			int fibo = fibRecusrion(i);
			System.out.print(fibo+", ");
		}
		
		

	}

}
