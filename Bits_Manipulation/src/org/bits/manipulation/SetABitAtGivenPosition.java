package org.bits.manipulation;

public class SetABitAtGivenPosition {

	public static int setBit(int num, int pos) {
		
		int x = 1 << (pos-1);
		return (num | x);
	}
	
	public static void main(String[] args) {
		int num1 = 13;
		int pos1 = 2;
		int num2 = 23;
		int pos2 = 4;
		System.out.println(setBit(num1, pos1));
		System.out.println(setBit(num2, pos2));

	}

}
