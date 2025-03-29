package org.string.leetcode.mediumProblems.revision;

public class LargestOddNumberInString {

	// TC O(n)
	// SC: O(n)
	public String largestOddNumber(String num) {
		String res = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			char ch = num.charAt(i);
			int x = ch - '0'; // convert character into numeric value through ASCII code
			if (x % 2 != 0) {
				res = num.substring(0, i + 1);
				break;
			}

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
