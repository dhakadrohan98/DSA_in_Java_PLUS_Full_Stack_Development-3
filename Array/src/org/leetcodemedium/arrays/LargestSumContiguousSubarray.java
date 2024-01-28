package org.leetcodemedium.arrays;

import java.util.Arrays;

public class LargestSumContiguousSubarray {
	
	public static int maxSubArray(int[] nums) {
        int max_so_far = Integer. MIN_VALUE;
        int max_till_here = 0;
        
        for(int i=0; i<nums.length; i++) {
        	
            max_till_here = max_till_here + nums[i];
            
           if(max_so_far < max_till_here) {
                max_so_far = max_till_here;
            }
            
            if(max_till_here < 0) {
                max_till_here = 0;
            }
        }
        return max_so_far;
    }

	public static int[] maxSubArray1(int[] nums) {
        int max_so_far = Integer. MIN_VALUE;
        int max_till_here = 0;
        int[] result = new int[2];
        int start=0;
        int end= nums.length;
        
        for(int i=0; i<nums.length; i++) {
        	
        	if(max_till_here == 0) {
        		start = i;
        	}
            max_till_here = max_till_here + nums[i];
            
           
            if(max_so_far < max_till_here) {
                max_so_far = max_till_here;
                result[0] = start;
                result[1] = i; //current index
                end = i;
            }
            
            if(max_till_here < 0) {
                max_till_here = 0;
            }
        }
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1 = {-2, -3, 4, -1, -2, 1, 5, -3};
		int[] result = maxSubArray1(nums1);
		
		int start = result[0];
		int end = result[1];
		System.out.println("Start: " + start);
	    System.out.println("End: " + end);
		
		for(int j=result[0]; j<=result[1]; j++) {
			System.out.print(nums1[j]+ " ");
		}
		System.out.println();
		
		int largestSum = maxSubArray(nums1);
		System.out.println("Largest Sum: " + largestSum);
		
		

	}

}
