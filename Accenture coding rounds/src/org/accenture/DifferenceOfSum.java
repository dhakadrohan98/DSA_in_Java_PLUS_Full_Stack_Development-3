package org.accenture;

import java.util.Scanner;

public class DifferenceOfSum {

	public static void main(String[] args) {
		int totalSum=0, oddSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of n");
		int n = sc.nextInt();
		System.out.println("Enter values of m");
		int m = sc.nextInt();
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			
			if(i%m != 0) {
				totalSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		System.out.println("Difference between oddSum & totalSum: " + (totalSum-oddSum));
		System.out.println(str);
	}

}
