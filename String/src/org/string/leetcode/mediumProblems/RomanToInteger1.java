package org.string.leetcode.mediumProblems;

import java.util.HashMap;

public class RomanToInteger1 {

	public static int romanToInt(String str) {
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("I", 1);
		hmap.put("V", 5);
		hmap.put("X", 10);
		hmap.put("L", 50);
		hmap.put("C", 100);
		hmap.put("D", 500);
		hmap.put("M", 1000);
		hmap.put("IV", 4);
		hmap.put("IX", 9);
		hmap.put("XL", 40);
		hmap.put("XC", 90);
		hmap.put("CD", 400);
		hmap.put("CM", 900);
		int num = 0;
		int len = str.length();
		int i = len - 1;

		while (i >= 1) {
			String curr = str.charAt(i) + "";
			String withPrev = str.charAt(i - 1) + curr;

			if (hmap.containsKey(withPrev)) {
				int val = hmap.get(withPrev);
				num = num + val;
				i = i - 2;
			} else {
				int val = hmap.get(curr);
				num = num + val;
				i--;
			}
		}

		if (i == 0) {
			num = num + hmap.get(str.charAt(i) + "");
		}
		return num;

	}

	public static void main(String[] args) {
		String str = "III";
		System.out.println(romanToInt(str));

	}

}
