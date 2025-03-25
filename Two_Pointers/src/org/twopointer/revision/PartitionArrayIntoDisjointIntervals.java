package org.twopointer.revision;

public class PartitionArrayIntoDisjointIntervals {
	
	//TC: O(3*n)
    //SC: O(2*n)
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < n; i++) {
            max = Math.max(max, nums[i]);
            maxLeft[i] = max;
        }
        for(int i=n-1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            minRight[i] = min;
        }
        for(int i = 1; i < n; i++) {
            if(maxLeft[i-1] <= minRight[i]) {
                return i;
            }
        }
        return n;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
