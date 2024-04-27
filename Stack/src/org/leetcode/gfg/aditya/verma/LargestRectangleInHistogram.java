package org.leetcode.gfg.aditya.verma;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class LargestRectangleInHistogram {
	//TC: 3 * O(n) left,right,width
    //SC: O(n)
	
	// NSR (int[] right)
	public static int[] nextSmallerElement(int[] nums, int n) {
		// Stack containing pair<nsE, indx>
		Stack<Data> st = new Stack<>();
		int[] right = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			// 1st check
			if (st.size() == 0) {
				right[i] = n;
			} // 2nd check]
			else if (st.size() > 0 && st.peek().ngl < nums[i]) {
				Data temp = st.peek();
				int index = temp.index;
				right[i] = index;
			} // 3rd check
			else if (st.size() > 0 && st.peek().ngl >= nums[i]) {
				while (st.size() > 0 && st.peek().ngl >= nums[i]) {
					st.pop();
				}
				// 4ht check
				if (st.size() == 0) {
					right[i] = n;
				}
				// if (st.peek() > nums[i])
				else {
					Data temp = st.peek();
					int index = temp.index;
					right[i] = index;
				}
			}
			// outside of all if, else if conditions, push current element into the stack.
			st.push(new Data(nums[i], i));
		}

		return right;
	}

	// NSL (int[] left)
	public static int[] prevSmaller(int[] nums, int n) {
		int[] left = new int[n];
		Stack<Data> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			// 1st check
			if (st.size() == 0) {
				left[i] = -1;
			} // 2nd check]
			else if (st.size() > 0 && st.peek().ngl < nums[i]) {
				Data temp = st.peek();
				int index = temp.index;
				left[i] = index;
			} // 3rd check
			else if (st.size() > 0 && st.peek().ngl >= nums[i]) {
				while (st.size() > 0 && st.peek().ngl >= nums[i]) {
					st.pop();
				}
				// 4ht check
				if (st.size() == 0) {
					left[i] = -1;
				}
				// if (st.peek() > nums[i])
				else {
					Data temp = st.peek();
					int index = temp.index;
					left[i] = index;
				}
			}
			// outside of all if, else if conditions, push current element into the stack.
			st.push(new Data(nums[i], i));
		}
		return left;
	}

	public static int largestRectangleArea(int[] heights) {
		int n = heights.length;
		int[] right = nextSmallerElement(heights, n);
		int[] left = prevSmaller(heights, n);

		// width arr
		int[] width = new int[n];
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			width[i] = right[i] - left[i] - 1;
			int area = heights[i] * width[i];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] heights = { 6, 2, 5, 4, 5, 1, 6 };
		int res = largestRectangleArea(heights);
		System.out.println(res);
	}

}
