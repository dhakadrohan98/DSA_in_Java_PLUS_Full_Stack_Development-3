package set;

import java.util.HashSet;
import java.util.Set;

public class StringToInteger1 {

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

	public static void main(String[] args) {
		String str = "21474836460";
		System.out.println(myAtoi(str));

	}

}
