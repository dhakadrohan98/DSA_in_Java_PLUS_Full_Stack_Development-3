package org.codeship.twopointer;

import java.util.Stack;

public class TrappingRainWater {

	public static int trap(int[] height) {
		// TC: O(n)
		// SC: O(1)

		if(height.length <= 1) {
			return 0;
		}
		Stack<Integer> st = new Stack<>();
		int water = 0;
		int i = 0;
		
		while(i < height.length) {
			System.out.println("i: " + i);
			if(st.isEmpty() || height[i] <= height[st.peek()]) {
				st.push(i);
				i++;
			} else {
				int currIndex = st.pop();
				System.out.println("currIndex: " + currIndex);
				if(!st.isEmpty()) {
					//find the smaller height between the two sides
					int minHeight = Math.min(height[st.peek()], height[i]);
					//calculate the area
					water += (minHeight - height[currIndex]) * (i - st.peek() - 1);
					System.out.println("water: " + water);
				}
			}
		}
		return water;
	}

	public static void main(String[] args) {
		int[] height = {5,4,3,2,7};
		System.out.println("Trapped water:" + trap(height));

	}

}

// TC: O(n)
// SC: O(n)
//
//		if (height.length <= 0) {
//			return 0;
//		}
//		int n = height.length;
//
//		int[] left = new int[n];
//		int max = height[0];
//		for (int i = 0; i < n; i++) {
//			max = Math.max(max, height[i]);
//			left[i] = max;
//		}
//
//		int[] right = new int[n];
//		max = height[n - 1];
//		for (int i = n - 1; i >= 0; i--) {
//			max = Math.max(max, height[i]);
//			right[i] = max;
//		}
//		int totalWater = 0;
//
//		for (int i = 0; i < n; i++) {
//			totalWater += Math.min(left[i], right[i]) - height[i];
//		}
//		return totalWater;
