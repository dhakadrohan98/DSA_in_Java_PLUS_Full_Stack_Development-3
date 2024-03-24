package com.recusrion.striver;

public class Print1toNUsingBacktracking {
	// TC: O(n)
	// SC: O(n) Stack space
	private static void func(int num, int N) {
		// base case
		if (num < 1) {
			return;
		}
		func(num - 1, N);
		System.out.print(num + " ");
	}

	public static void main(String[] args) {
		int N = 5;
		func(N, N);

	}

}
