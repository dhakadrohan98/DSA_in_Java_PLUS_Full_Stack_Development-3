package org.math;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num for fibonacci series: ");
		int num = sc.nextInt();
		int first=0, next=1;
		System.out.print(first+", "+next);
		for(int i=1; i<=num-2; i++) {
			int other = first+next;
			System.out.print(", "+other);
			first=next;
			next = other;
		}

	}

}
