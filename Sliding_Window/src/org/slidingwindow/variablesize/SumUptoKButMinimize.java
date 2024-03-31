package org.slidingwindow.variablesize;

public class SumUptoKButMinimize {

	public static int computeMinSumLen(int[] nums, int x) {
		int[] prefix = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			prefix[i] += nums[i];
		}
		//sorted prefix sum arr we have now
		
		
		return len;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,2,4,1,6};
		int x = 7;

	}

}
