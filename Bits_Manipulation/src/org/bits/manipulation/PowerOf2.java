package org.bits.manipulation;

public class PowerOf2 {

	public static boolean checkpowerOf2(int num) {

		if (num <= 0) {
			return false;
		} else if ((num & (num - 1)) > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int num1 = 16;
		int num2 = 18;
		int num3 = 8;
		int num4 = 21;
		System.out.println(16 & 15);
		System.out.println(checkpowerOf2(num1));
		System.out.println(checkpowerOf2(num2));
		System.out.println(checkpowerOf2(num3));
		System.out.println(checkpowerOf2(num4));

	}

}
