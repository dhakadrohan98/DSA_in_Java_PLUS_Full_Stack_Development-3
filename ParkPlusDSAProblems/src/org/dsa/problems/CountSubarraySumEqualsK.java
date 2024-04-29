package org.dsa.problems;

//Naive Approach
public class CountSubarraySumEqualsK {
	//TC: O(n^2)
	//SC: O(1)
	public static int countSubarraySum(int[] nums, int target) {
		int n = nums.length;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum += nums[j];
				if(sum == target) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,-3,1,1,1,4,2,-3};
		int target = 3;
		System.out.println(countSubarraySum(nums, target));

	}

}
