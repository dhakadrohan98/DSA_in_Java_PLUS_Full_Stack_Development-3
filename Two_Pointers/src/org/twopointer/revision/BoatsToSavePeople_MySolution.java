package org.twopointer.revision;

import java.util.Arrays;

// 33/78 test cases are passed
public class BoatsToSavePeople_MySolution {
	
	//TC: O(n * logn)
	public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int n = nums.length;
        int minBoat = 0;
        int left = 0;
        int right = 0;
        while(right < n && left < n) {
            if(right == n-1) {
                right = left;
            } else {
                right = left+1;
            }
            int sumOfTwoPerson = nums[left] + nums[right];
            if(sumOfTwoPerson <= limit) {
                minBoat += 1;
                right++;
                left = right;
            } else {
                minBoat += 1;
                left++;
            }
        }
        return minBoat;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
