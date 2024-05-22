package com.PreDirectorRound;

public class LargestOddNumber {

	public static String largestOddNumber(String num) {

		String res = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			char ch = num.charAt(i);
			int x = ch - '0'; // convert character into numeric value through ASCII code
			if (x % 2 != 0) {
				System.out.println(x);
				res = num.substring(0, i + 1);
				break;
			}

		}
		return res;
	}

	public static void main(String[] args) {
		String num = "35427";
		int asciiVal = 'z';
		System.out.println(asciiVal);
		System.out.println(largestOddNumber(num));
	}

}
