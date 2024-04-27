package org.leetcode.gfg.aditya.verma;

import java.util.Stack;

public class NextSmallerToLeft {

	// TC: O(n)
	// SC: O(n) auxiliary space
	public static int[] prevSmaller(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			// 1st check
			if (st.size() == 0) {
				ans[i] = -1;
			} // 2nd check]
			else if (st.size() > 0 && st.peek() < nums[i]) {
				ans[i] = st.peek();
			} // 3rd check
			else if (st.size() > 0 && st.peek() >= nums[i]) {
				while (st.size() > 0 && st.peek() >= nums[i]) {
					st.pop();
				}
				// 4ht check
				if (st.size() == 0) {
					ans[i] = -1;
				}
				// if (st.peek() > nums[i])
				else {
					ans[i] = st.peek();
				}
			}
			// outside of all if, else if conditions, push current element into the stack.
			st.push(nums[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 2, 10, 8 };
		int[] res = prevSmaller(nums);
		for (int val : res) {
			System.out.println(val);
		}

	}

}
