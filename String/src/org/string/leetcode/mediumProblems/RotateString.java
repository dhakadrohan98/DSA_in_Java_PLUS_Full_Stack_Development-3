package org.string.leetcode.mediumProblems;

public class RotateString {

	public static boolean rotateString(String s, String goal) {
		int len1 = s.length();
		int len2 = goal.length();

		if (len1 != len2) {
			return false;
		} else {
			String str = s + s;
			int index = str.indexOf(goal);
			if (index != -1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
