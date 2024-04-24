package org.codeship.binarysearch;

public class CeilTheFloor {

	public static int[] getFloorAndCeil(int[] nums, int n, int x) {
	      int[] ans = new int[2];
	      int floor = -1;
	      int ceil = -1;
	      int low = 0;
	      int high = n-1;

	      while(low <= high) {
	        int mid = (low+high)/2;
	        
	        if(nums[mid] == x) {
	          floor = nums[mid];
	          ceil = nums[mid];
	          break;
	        }
	        else if(nums[mid] <= x) {
	          floor = nums[mid];
	          low = mid + 1;
	        }
	        else if(nums[mid] >= x) {
	          ceil = nums[mid];
	          high = mid - 1;
	        }
	      }

	      ans[0] = floor;
	      ans[1] = ceil;
	      return ans;
	    }
	
	public static void main(String[] args) {
		int[] nums = {3, 4, 7, 8, 8, 10};
		int n=nums.length, x=5;
		int[] ans = getFloorAndCeil(nums, n, x);
		
		for(int temp:ans) {
			System.out.println(temp);
		}

	}

}
