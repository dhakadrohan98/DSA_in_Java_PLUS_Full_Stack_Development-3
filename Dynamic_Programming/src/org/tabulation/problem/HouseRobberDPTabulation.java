package org.tabulation.problem;

public class HouseRobberDPTabulation {
	//TC: O(N)
	//SC: O(N)
	//Tabulation -> space optimization
	public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        //base cases of recursive approach
        dp[0] = nums[0];
        int neg = 0; //for (indx - 2) condition
        
        for(int i = 1; i < n; i++) {
        	int take = nums[i];
        	if(i > 1) {
        		take += dp[i-2];
        	}
        	int nonTake = 0 + dp[i-1];
        	dp[i] = Math.max(take, nonTake);
        }
        
        return dp[n-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
