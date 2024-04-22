package org.recursion.pure.solution;

public class HouseRobber {
	//TC: O(2^n)
	//SC: O(n)
	 public int helper(int indx, int[] nums) {
	        //base cases
	        if(indx == 0) return nums[indx];
	        if(indx < 0) return 0;
	        //recursive call to helper(indx-2) & helper(indx-1)
	        int pick = nums[indx] + helper(indx - 2, nums);
	        int notPick = 0 + helper(indx - 1, nums);
	        return Math.max(pick, notPick);
	    }
	    
	    public int rob(int[] nums) {
	        int n = nums.length;
	        return helper(n-1, nums);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
