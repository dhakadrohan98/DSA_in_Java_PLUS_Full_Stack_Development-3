package org.string.leetcode.mediumProblems;

import java.util.HashSet;
import java.util.Set;

public class StringToInteger_Atoi {

	//All test cases(1095) are passed
	public static int myAtoi(String s) {
        s = s.trim();
		long ans = 0;
		boolean neg = false;
		Set<Character> set = new HashSet<>();
		set.add('0');
		set.add('1');
		set.add('2');
		set.add('3');
		set.add('4');
		set.add('5');
		set.add('6');
		set.add('7');
		set.add('8');
		set.add('9');
        //base case
		if (s.length() == 0) {
			return 0;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (i == 0) {
				if (ch == '-') {
					neg = true;
					continue;
				} else if (ch == '+') {
					neg = false;
					continue;
				}
			}

			if (ch >= '0' && ch <= '9') {
				int digit = ch - '0';
				ans = ans * 10 + digit;

				// ans is not the in range [2^-31, 2^31 - 0]
				if (neg) {
					if (-ans < Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					}
				} else if (ans > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			} else {
				break;
			}
		}

		if (neg) {
			ans = -ans;
		}

		return (int) ans;
    }
	
	// 0-48
	// 1-49
	// 2-50
	// 3-51
	// 4-52
	// 5-53
	
	//519 out of 1095 test cases are passed
	public static int myAtoiRevisionSelf(String s) {
		s = s.trim();
		int i = 0;
		// take the long data type because if at any point if ans is greater than 2^31 -
		// 1 or less than -2^31 then we need to return the ans in the integer range.
		long ans = 0;
		int sign = 1;
		while (i < s.length()) {
			char ch = s.charAt(i);
			if (i == 0 && ch == '-') {
				sign = -1;
				i++;
			} else if (i == 0 && ch == '+') {
				sign = 1;
				i++;
			}
			// skip the zero
			else if (ch == '0') {
				i++;
			} else if (ch >= 48 && ch <= 57) {
				ans = (ans * 10) + (ch - '0');
				System.out.println(ans);
				if ((sign * ans) < 0 && (sign * ans) < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				} else if ((sign * ans) > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
				i++;
			} else { // character is non-digit character, stop here & here
				return sign * (int) ans;
			}
		}
		return sign * (int) ans;
	}

	public static void main(String[] args) {
		String str = "42";
		String str1 = "   -042";
		String str3 = "1337c0d3";
		String str5 = "91283472332";
		String str6 = "+1";
		//last failed test case
		String str4 = "21474836460";
		System.out.println(myAtoiRevisionSelf(str4));
	}

}
