package org.codeship.binarysearch;

public class HowManyTimesHasAnArrayBeenRotated {

	public static int findKRotation(int[] nums){
		  int low = 0, high = nums.length-1;
	        int ans = Integer.MAX_VALUE;
	        int index = -1;
	        
	        while(low <= high) {
	            int mid = (low + high) / 2;
	            //search space is already sorted then always arr[low] will be smaller in that
	            //search space.
	            if(nums[low] <= nums[high]) {
	                if(nums[low] < ans) {
	                	index = low;
	                	ans = nums[low];
	                }
	                break;
	            }
	            
	            
	            //if left half is sorted
	            if(nums[low] <= nums[mid]) {
	            	if(nums[low] < ans) {
	                	index = low;
	                	ans = nums[low];
	                }
	                //eliminate the left half
	                low = mid + 1;
	            }
	            //right half is sorted
	            else { 
	            	if(nums[mid] < ans) {
	                	index = mid;
	                	ans = nums[mid];
	                }
	                //eliminate the right half
	                high = mid - 1;
	            }
	        }
	        return index;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
