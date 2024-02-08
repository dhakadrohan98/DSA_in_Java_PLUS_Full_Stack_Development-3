package org.codeship.twopointer;

import java.util.Arrays;

public class ValidTriangleNumber {

	//TC: O(n^2)
    //SC: O(1)
	public int triangleNumber(int[] nums) {
        int ans = 0;
        //If length of nums is less than 3;
        if(nums.length < 3) {
            return ans;
        }
        
        Arrays.sort(nums);
        
        for(int i=2; i< nums.length; i++) {
            int left = 0;
            int right = i - 1;
            
            while(left < right) {
                if(nums[left] + nums[right] > nums[i]) {
                    ans = ans + (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
