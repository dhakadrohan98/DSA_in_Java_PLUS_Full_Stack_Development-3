package org.codeship.binarysearch;

public class SearchInsertPosition {

	  public static int searchInsert(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length - 1;
	        int ans = nums.length;
	        while(low <= high) {
	            int mid = (low+high)/2;
	            
	            if(nums[mid] == target) {
	                return mid;
	            } else if(nums[mid] > target) {
	                ans = mid;
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	        return ans;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
