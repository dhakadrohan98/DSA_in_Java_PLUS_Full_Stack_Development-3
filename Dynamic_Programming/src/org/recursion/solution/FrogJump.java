package org.recursion.solution;

public class FrogJump {
	
	static int right = 0;
	static int min = Integer.MAX_VALUE;

	public static int frogJump(int n, int heights[]) {
		int ans = fuc(n - 1, heights);
		return ans;
	}

	public static int fuc(int indx, int heights[]) {
		// base case
		if (indx == 0)
			return 0;

		int left = fuc(indx - 1, heights) + Math.abs(heights[indx] - heights[indx - 1]);
		if (indx > 1) { // because if indx = 1 then (indx - 2) = -1 (invalid index exception occurs)
			right = fuc(indx - 2, heights) + Math.abs(heights[indx] - heights[indx - 2]);
		}

		min = Math.min(left, right);
		return min;
	}

	public static void main(String[] args) {
		int[] heights = { 10, 20, 30, 10 };
		System.out.println(frogJump(4, heights));

	}

}
