package org.leetcode.gfg.aditya.verma;

import java.util.*;

public class NextSmallerElementToRight {
	// TC: O(n)
	// SC: O(n) auxiliary space
	public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> nums, int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> st = new Stack<>();

		for (int i = n-1; i >= 0; i--) {
			// 1st check
			if (st.size() == 0) {
				ans.add(0, -1);
			} // 2nd check]
			else if (st.size() > 0 && st.peek() < nums.get(i)) {
				ans.add(0,st.peek());
			} // 3rd check
			else if (st.size() > 0 && st.peek() >= nums.get(i)) {
				while (st.size() > 0 && st.peek() >= nums.get(i)) {
					st.pop();
				}
				// 4ht check
				if (st.size() == 0) {
					ans.add(0, -1);
				}
				// if (st.peek() > nums[i])
				else {
					ans.add(0,st.peek());
				}
			}
			// outside of all if, else if conditions, push current element into the stack.
			st.push(nums.get(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(3);
		ArrayList<Integer> res = nextSmallerElement(arr, arr.size());
		for (Integer val : res) {
			System.out.println(val);
		}

	}
}
