package org.leetcodemedium.arr;

public class KadanesAlgorithm_MaximumSubarray {
	
	//TC: O(n)
	//SC: O(1)
	public int maxSubArray(int[] nums) {
        int maxi = nums[0];
        int currSum = 0;
        //edge case
        // if(nums.length == 1) {
        //     return nums[0];
        // }
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxi = Math.max(maxi, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxi;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
