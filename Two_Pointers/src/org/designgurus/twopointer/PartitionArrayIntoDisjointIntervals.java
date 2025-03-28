package org.designgurus.twopointer;

public class PartitionArrayIntoDisjointIntervals {

	public int partitionDisjoint(int[] nums) {
        int maxUntilI = nums[0];
        int maxInLeftPartition = nums[0];
        int partitionId = 0;
        
        for(int i=1; i<nums.length; i++) {
            maxUntilI = Math.max(maxUntilI, nums[i]);
            if(nums[i] < maxInLeftPartition) {
                maxInLeftPartition = maxUntilI;
                partitionId = i;
            }
        }
        return partitionId+1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// public int partitionDisjoint(int[] nums) {
//  int len = nums.length;
//  int[] lmax = new int[len];
//  int[] rmin = new int[len];
 
//  int max = Integer.MIN_VALUE;
//  for(int i=0; i<nums.length; i++) {
//      max = Math.max(max, nums[i]);
//      lmax[i] = max;
//  }
 
//  int min = Integer.MAX_VALUE;
//  for(int i = len-1; i >= 0; i--) {
//      min = Math.min(min, nums[i]);
//      rmin[i] = min;
//  }
 
//  for(int i=1; i<nums.length; i++) {
//      if(lmax[i-1] <= rmin[i]) {
//          return i;
//      }
//  }
//  return nums.length;
//}

}
