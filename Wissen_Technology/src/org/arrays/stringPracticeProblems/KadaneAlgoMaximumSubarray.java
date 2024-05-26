package org.arrays.stringPracticeProblems;

public class KadaneAlgoMaximumSubarray {
	//TC: O(n)
    //SC: O(1)
	public static int maxSubArray(int[] nums) {
		int currSum = 0;
		int largetSum = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			currSum += nums[i];
			largetSum = Math.max(largetSum, currSum);
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return largetSum;
	}

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}

}
