package org.dsa.problems;

import java.util.*;

public class SlidingWindowMaximum {
	//TC: O(N)
	//SC: O(N) auxiliary space
	public static int[] maxSlidingWindow(int[] nums, int k) {
		List<Integer> ans = new ArrayList<Integer>();
		if (k > nums.length) {
			ans.add(0);
		}

		List<Integer> list = new ArrayList<Integer>();
		int i = 0, j = 0;

		while (j < nums.length) {
			// calculate ans
			int lastPos = list.size() - 1;

			while (list.size() > 0 && list.get(lastPos) < nums[j]) {
				list.remove(lastPos);
				lastPos = list.size() - 1;
			}
			list.add(nums[j]);

			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				ans.add(list.get(0));

				if (list.get(0) == nums[i]) {
					list.remove(0);
				}
				i++;
				j++;
			}
		}
		int[] res = new int[ans.size()];
		for (int k1 = 0; k1 < res.length; k1++) {
			res[k1] = ans.get(k1);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		int[] nums1 = { 9, 10, 9, -7, -4, -8, 2, -6 };
		int k1 = 5;
		int[] maxSlidingWindow = maxSlidingWindow(nums1, k1);
		for (int val : maxSlidingWindow) {
			System.out.print(val + " ");
		}

	}

}

//priority queue
//public static int[] maxSlidingWindow(int[] nums, int k) {
//	// base cases
//	if (nums.length == 1)
//		return new int[] { nums[0] };
//
//	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//	int n = nums.length;
//	List<Integer> res = new ArrayList<Integer>();
//	int i = 0, j = 0;
//	int max = Integer.MIN_VALUE;
//	List<Integer> list = new ArrayList<>();
//
//	while (j < n) {
//		// Do some calculations
//		pq.add(nums[j]);
//		System.out.println("pq: " + pq);
//
//		if (j - i + 1 < k) {
//			j++;
//		} else if (j - i + 1 == k) {
//			// calculate ans
//			res.add(pq.peek());
//			// remove calculation from DS
//			while (pq.peek() == nums[i]) {
//				pq.remove();
//			}
//			// slide the window
//			i++;
//			j++;
//		}
//	}
//
//	int[] ans = new int[res.size()];
//	for (int k1 = 0; k1 < ans.length; k1++) {
//		ans[k1] = res.get(k1);
//	}
//	return ans;
//}