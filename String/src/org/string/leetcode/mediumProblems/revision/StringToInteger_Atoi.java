package org.string.leetcode.mediumProblems.revision;

public class StringToInteger_Atoi {

	// TC: O(n)
	// SC: O(n)
	public int myAtoi(String s) {
		s = s.trim();
		// edge case
		if (s.length() == 0) {
			return 0;
		}
		// consider ans is positive at the starting
		boolean neg = false;
		long ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (i == 0) {
				if (ch == '-') {
					neg = true;
					continue;
					// move to the next character
				} else if (ch == '+') {
					neg = false;
					continue;
					// move to the next character
				}
			}
			// compare ch with its ASCII value
			if (ch >= 48 && ch <= 57) {
				int digit = ch - '0';
				ans = ans * 10 + digit;

				if (neg) {
					long check = -ans;
					// if ans has become less than Integer min value then return Integer min value
					if (check < Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					}
				} else {
					// if ans has become less than Integer max value then return Integer max value
					if (ans > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
				}
			} else {
				// if character is non digit character
				break;
			}
		}
		// if we found the negative symbol at 0th index of s then make the ans negative
		// before returning
		if (neg) {
			ans = -ans;
		}

		return (int) ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
