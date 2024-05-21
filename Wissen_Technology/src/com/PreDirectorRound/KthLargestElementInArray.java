package com.PreDirectorRound;

import java.util.*;

public class KthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++) {
            pq.offer(nums[i]);
        }
        
        for(int i = k; i < nums.length; i++) {
            if(pq.peek() < nums[i]) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
	
	public static void main(String[] args) {
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k = 4;
		System.out.println(findKthLargest(nums, k));
	}

}
