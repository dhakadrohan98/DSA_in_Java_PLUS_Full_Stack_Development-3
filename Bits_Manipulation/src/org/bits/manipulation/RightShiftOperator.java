package org.bits.manipulation;

import java.util.Scanner;

public class RightShiftOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for num & shift: ");
		int num = sc.nextInt();
		int shift = sc.nextInt();
		//right shift by 1 : 23 >> 1
		System.out.println("Right shift by 1 : 23 >> 1 :: " + (num >> shift));

	}

}
