package org.string.leetcode.mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInt(String str) {

		Map<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int i = 0;
		int res = 0;
		int length = str.length();

		// System.out.println(map);
		// System.out.println("String length: " + length);

		while (i < length) {

			String combine = "";
			char first = str.charAt(i);
			if (i != str.length() - 1) {

				char second = str.charAt(i + 1);
				combine = "" + first + second;

				if (combine.equals("IV")) {
					res += 4;
					i += 2;
				}

				else if (combine.equals("IX")) {
					res += 9;
					i += 2;
				}

				else if (combine.equals("XL")) {
					res += 40;
					i += 2;
				}

				else if (combine.equals("XC")) {
					res += 90;
					i += 2;
				}

				else if (combine.equals("CD")) {
					res += 400;
					i += 2;
				}

				else if (combine.equals("CM")) {
					res += 900;
					i += 2;
				}

				else {
					res = res + map.get(str.charAt(i));
					i++;
				}
			}

			// Use map to get values of roman character
			else {
				res = res + map.get(first);
				i++;
			}
		}

		return res;

	}

	public static void main(String[] args) {
		String str = "MCMXCIV";
		System.out.println(romanToInt(str));

	}

}
