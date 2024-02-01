package org.string.leetcode.mediumProblems;

public class LargestOddNumberinString {

	public static String largestOddNumber(String str) {
		int len = str.length();
		String tempStr = str.charAt(len - 1) + "";
		int digit = Integer.parseInt(tempStr);
		String substring = "";

		if (digit % 2 != 0) {
			return str;
		} else {
			for (int i = len - 2; i >= 0; i--) {
				tempStr = str.charAt(i) + "";
				digit = Integer.parseInt(tempStr);
				if (digit % 2 != 0) {
					substring = str.substring(0, i + 1);
					return substring;
				}

			}
		}

		return substring;
	}

	public static void main(String[] args) {
		String str1 = "4924342";
		String str2 = "11740";
		String str3 = "239537672423884969653287101";
		System.out.println(largestOddNumber(str1));
		System.out.println(largestOddNumber(str2));
		System.out.println("Empty string:" + largestOddNumber(str3));

	}
}
