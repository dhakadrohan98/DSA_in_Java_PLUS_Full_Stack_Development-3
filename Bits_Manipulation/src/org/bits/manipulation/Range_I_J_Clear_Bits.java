package org.bits.manipulation;

public class Range_I_J_Clear_Bits {

	//Medium level problem
	public static int rangeClearBits(int num, int i, int j) {
		int x = (~0) << j;
		int y = (1 << (i-1)) - 1;
		int z = x | y;
		return (z & num);
	}
	
	public static void main(String[] args) {
		int num = 23; // 10111
		int i = 3, j = 4;
		System.out.println(rangeClearBits(num, i, j)); //10011 = 16+3 = 19

	}

}
