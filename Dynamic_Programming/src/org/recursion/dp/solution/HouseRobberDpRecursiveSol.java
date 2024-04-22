package org.recursion.dp.solution;

import java.util.Arrays;

public class HouseRobberDpRecursiveSol {
	//TC: O(N)
	//SC: O(N) stack space + O(N) dp array
	public int helper(int indx, int[] nums, int[] dp) {
        //Three base cases
        if(indx == 0) return nums[indx];
        if(indx < 0) return 0;
        if(dp[indx] != -1) {
        	return dp[indx];
        }
        
        //recursive call to helper(indx-2) & helper(indx-1)
        int pick = nums[indx] + helper(indx - 2, nums, dp);
        int notPick = 0 + helper(indx - 1, nums, dp);
        dp[indx] = Math.max(pick, notPick);
        return dp[indx];
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(n-1, nums, dp);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
