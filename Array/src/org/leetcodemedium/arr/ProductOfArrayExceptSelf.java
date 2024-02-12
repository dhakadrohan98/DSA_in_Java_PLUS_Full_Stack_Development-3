package org.leetcodemedium.arr;

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int temp = 1;
        for(int i=0; i<nums.length; i++) {
            result[i] = temp;
            temp = temp * nums[i];
        }
        
        temp=1;
        for(int i=nums.length-1; i>=0; i--) {
            result[i] = result[i] * temp;
            temp = temp * nums[i];
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
