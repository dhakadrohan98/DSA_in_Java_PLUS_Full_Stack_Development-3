package org.space.optimizationsolution;

public class FrogJump {

	public static int frogJump(int n, int[] heights) {
		
		int prev = 0;
		int prev2 = 0;
		
		for(int i=1; i < n; i++) {
			int firstStep = prev + Math.abs(heights[i] - heights[i-1]);
			int secondStep = Integer.MAX_VALUE;
			if(i > 1) {
				secondStep = prev2 + Math.abs(heights[i] - heights[i-2]);
			}
			int curr = Math.min(firstStep, secondStep);
			prev2 = prev;
			prev = curr;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
