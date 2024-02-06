package org.string.leetcode.mediumProblems;

public class StringToInteger {

	public static int myAtoi(String s) {
		s = s.strip(); //The strip() method in Java is used to remove leading and trailing white spaces from a string
		if (s.isEmpty())
			return 0;

		//if character at 0th index is - then store -1 into sign variable otherwise store 1.
		final int sign = s.charAt(0) == '-' ? -1 : 1;
		// If 0th character is ‘+’ or ‘-’ then take substring(1, str.size()) into s;
		if (s.charAt(0) == '+' || s.charAt(0) == '-')
			s = s.substring(1);

		long num = 0;

		//Convert s string into character array & iterate over its character, if numeric value at i^th index is out of range[0,9] then break the loop here, Otherwise keep iterating continue over char array
		for (final char c : s.toCharArray()) {
			if (!(Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <= 9))
				break;
			num = num * 10 + Character.getNumericValue(c);
			if (sign * num <= Integer.MIN_VALUE) //Integer.MIN_VALUE = -2^31;
				return Integer.MIN_VALUE;
			if (sign * num >= Integer.MAX_VALUE) //Integer.MAX_VALUE = 2^31-1;
				return Integer.MAX_VALUE;
		}

		return sign * (int) num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
