package org.recursion.pure.solution;

public class ClimbingStairsPureRecursiveSol {

	// TC: O(2 ^ n)
	// SC: O(n) stack space
	public static int climbStairs(int n) {
		// two base case
		if (n == 0 || n == 1)
			return 1;

		int left = climbStairs(n - 1);
		int right = climbStairs(n - 2);
		return left + right;
	}

	public static void main(String[] args) {
		int stairs = 5;
		System.out.println(climbStairs(stairs));

	}

}
