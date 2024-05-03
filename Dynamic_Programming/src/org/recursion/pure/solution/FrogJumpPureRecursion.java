package org.recursion.pure.solution;

public class FrogJumpPureRecursion {
	//TC: O(2 ^ n)
	//SC: O(n)
	public static int frogJump(int n, int[] heights) {
		return helper(n-1, heights);
	}

	private static int helper(int indx, int[] heights) {
		//base case
		if(indx == 0) {
			return 0;
		}
		
		int left = helper(indx-1, heights) + Math.abs(heights[indx]- heights[indx-1]);
		int right = Integer.MAX_VALUE;
		if(indx > 1) {
			right = helper(indx-2, heights) + Math.abs(heights[indx]- heights[indx-2]);
		}
		return Math.min(left, right);
	}
}
