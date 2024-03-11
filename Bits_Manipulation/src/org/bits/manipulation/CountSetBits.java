package org.bits.manipulation;

public class CountSetBits {
	public static int countSetBit(int n) {
		int counter = 0;
		while (n > 0) {
			if ((n & 1) > 0) {
				counter++;
			}
			n = n >> 1;
		}
		return counter;
	}

	public static void main(String[] args) {
		int num1 = 23; // 10111
		int num2 = 5;  //101
		System.out.println(countSetBit(num1));
		System.out.println(countSetBit(num2));
	}
}
