package org.bits.manipulation;

import java.util.Scanner;

public class Clear_Ith_Bit {

	public static int clearIthBit(int num, int pos) {
		int x = 1 << (pos-1);
		int y = ~(x);
		
		return (num & y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of num & pos: ");
		int num = sc.nextInt();
		int pos = sc.nextInt();
		System.out.println(clearIthBit(num, pos));

	}
}
