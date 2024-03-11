package org.bits.manipulation;

import java.util.Scanner;

public class InsertNIntoMSuchThatStartsAtJAndEndsAtI {

	public static int replaceWithinGivenRange(int m, int n, int i, int j) {
		int x = ~(0) << j;
		int y = (1 << (i-1)) - 1;
		int z = x | y;
		int first = m & z;
		
		int second = (n << (i-1));
		return (first | second);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of m, n, i & j respectively");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
	
		System.out.println(replaceWithinGivenRange(m, n, i, j));
	}
}
