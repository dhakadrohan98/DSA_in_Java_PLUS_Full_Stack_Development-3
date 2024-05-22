package com.PreDirectorRound;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		// sort the given array
		Arrays.sort(strs);
		// first word of strs
		String first = strs[0];
		// last word of strs
		String last = strs[strs.length - 1];
		int len = 0;
		StringBuilder sb = new StringBuilder("");

		// assign smaller string lenght to len.
		if (first.length() > last.length()) {
			len = last.length();
		} else {
			len = first.length();
		}

		for (int i = 0; i < len; i++) {
			if (first.charAt(i) == last.charAt(i)) {
				sb.append(first.charAt(i));
			} else {
				break;
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
