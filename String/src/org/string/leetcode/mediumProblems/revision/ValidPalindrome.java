package org.string.leetcode.mediumProblems.revision;

public class ValidPalindrome {

	// TC: O(n)
	// SC: O(n)
	public boolean palindorme(String p) {
		int len = p.length();
		int i = -1, j = -1;
		if (len % 2 == 0) {
			j = len / 2;
			i = j - 1;
		} else {
			i = j = len / 2;
		}
		while (i >= 0 && j < p.length() && p.charAt(i) == p.charAt(j)) {
			i--;
			j++;
		}
		if (j == p.length()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPalindrome(String s) {
		s = s.trim();
		s = s.toLowerCase();
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if ((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)) {
				sb.append(ch);
			}
		}
		String p = sb.toString();
		return palindorme(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
