package org.designgurus.twopointer.revision;

public class TrappingRainWater {
	
	//Intuition: use leftMax & rightMax arrays to know the quantity of water that
    //will be trapped equivalent to the min height of both buidlings.
    //TC: O(3n)
    //SC: O(2n)
    public int trap(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] leftMax = new int[n];
        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            leftMax[i] = max;
        }

        max = 0;
        int[] rightMax = new int[n];
        for(int i = n-1; i >= 0; i--) {
            max = Math.max(max, nums[i]);
            rightMax[i] = max;
        }

        int totalWater = 0;
        for(int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - nums[i];
        }
        return totalWater;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
