package com.recusrion.striver;

public class CheckPalindromeThroughFunctionalRecursion {

	// TC: O(n/2)
	// SC: O(n/2) (auxiliary space)
	private static boolean func(int i, String str, int n) {
		// base case
		if (i >= n / 2) {
			return true;
		}

		if (str.charAt(i) != str.charAt(n - 1 - i)) {
			return false;
		}
		return func(i + 1, str, n);
	}

	public static void main(String[] args) {
		String str = "madam";
		int n = str.length();
		String str2 = "madsm";
		int n2 = str2.length();
		System.out.println("Is \"madam\" palindrome?");
		boolean isPalindrome = func(0, str, n);
		System.out.println(isPalindrome);
		System.out.println("Is \"madsm\" palindrome?");
		System.out.println(func(0, str2, n2));
	}

}
