package org.bits.manipulation;

public class Clear_I_Bits {

	public static int clearIBits(int num, int pos) {
		int x = num >> pos;
		return x << pos;
	}
	
	public static void main(String[] args) {
		int num = 23;
		int i = 3;
		System.out.println(clearIBits(num, i));

	}

}
