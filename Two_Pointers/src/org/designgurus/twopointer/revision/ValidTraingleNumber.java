package org.designgurus.twopointer.revision;

import java.util.Arrays;

public class ValidTraingleNumber {
	
	//Mandatory steps: sort the array first & then apply two pointers technique
    //TC: O(n^2)
    //SC: O(logn)
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i = 2; i < n; i++) {
            int left = 0;
            int right = i -1;
            while(left < right) {
                int sumTwoSides = nums[left] + nums[right];
                if(sumTwoSides <= nums[i]) {
                    left++;
                } else {
                    //calculate ans
                    count += (right - left);
                    right--;
                }
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
