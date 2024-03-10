package org.bits.manipulation;

import java.util.Scanner;

public class Find_I_th_Bit {

	public static void FindIthBit1(int num, int pos) {

		int target = 1 << pos - 1; // 1<<3-1 = (100) = 4
		if ((num & target) > 0) {
			System.out.println(pos + " th bit is: " + 1);
		} else {
			System.out.println(pos + " th bit is: " + 0);
		}
	}

	public static void FindIthBit2(int num, int bitPos) {

		int target = (int) Math.pow(2, bitPos - 1);
		if ((num & target) > 0) {
			System.out.println(bitPos + " th bit is: " + 1);
		} else {
			System.out.println(bitPos + " th bit is: " + 0);
		}
	}

	public static void main(String[] args) {
		int num1 = 23; // 10111
		int num2 = 21; // 10101
		int pos1 = 4;
		int pos2 = 5;
		
		System.out.println("Through FindIthBit1 : ");
		FindIthBit1(num1, pos1);
		
		System.out.println("Through FindIthBit2 : ");
		FindIthBit2(num2, pos2);

	}

}
