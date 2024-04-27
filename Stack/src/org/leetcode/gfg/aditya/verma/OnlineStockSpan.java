package org.leetcode.gfg.aditya.verma;

import java.util.*;
import java.util.List;

public class OnlineStockSpan {

	public static int[] calculateSpan(int nums[], int n)
    {
		List<Integer> list = new ArrayList<>();
		Stack<Data> st = new Stack<>();
		int[] ans = new int[n];
		
		for (int i = 0; i < n; i++) {
			// 1st check
			if (st.size() == 0) {
				list.add(0,-1);
			} // 2nd check]
			else if (st.size() > 0 && st.peek().ngl > nums[i]) {
				Data temp = st.peek();
				int index = temp.index;
				list.add(0,index);
			} // 3rd check
			else if (st.size() > 0 && st.peek().ngl <= nums[i]) {
				while (st.size() > 0 && st.peek().ngl <= nums[i]) {
					st.pop();
				}
				// 4ht check
				if (st.size() == 0) {
					list.add(0,-1);
				}
				// if (st.peek().ngl > nums[i])
				else {
					Data temp = st.peek();
					int index = temp.index;
					list.add(0,index);
				}
			}
			// outside of all if, else if conditions, push current element with its index into the stack.
			st.push(new Data(nums[i],i));
		}
		//In the list, we got indexes into reverse manner
		
		for(int i = 0, j = n-1; i < list.size() && j >= 0; i++,j--) {
			ans[i] = i - list.get(j);
		}
		return ans;
    }

	public static void main(String[] args) {
		int[] nums = {100, 80, 60, 70, 60, 75, 85};
		int[] ans = calculateSpan(nums, nums.length);
		
		for(int val:ans) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
