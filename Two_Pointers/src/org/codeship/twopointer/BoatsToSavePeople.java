package org.codeship.twopointer;

import java.util.Arrays;

public class BoatsToSavePeople {
	
	//TC: O(n * logn) + O(n)
    //SC: O(log n)
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int n = nums.length;
        int boat = 0;
        int i = 0, j = n-1;
        //solve greedily -> if heavy person can make pair with light person then send them away in a boat
        //otherwise send  the heavy person at least in a boat
        while(i <= j) {
            if(nums[i] + nums[j] <= limit) {
                j--;
                i++;
            } else {
                j--;
            }
            boat += 1;
        }
        return boat;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
