package org.heap.algorithms;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {
		int n = nums.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			pq.offer(nums[i]);
		}

		for (int i = k; i < n; i++) {
			if (nums[i] > pq.peek()) {
				pq.poll();
				pq.offer(nums[i]);
			}
		}
		return pq.peek();
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int[] nums1 = { 3, 2, 1, 5, 6, 4 };
		int k = 4;
		int k1 = 2;
		System.out.println(findKthLargest(nums1, k1));

	}

}
