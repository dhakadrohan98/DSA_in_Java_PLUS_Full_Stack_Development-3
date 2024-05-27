package org.arrays.stringPracticeProblems;

//optimal approach
public class SingleElementInSortedArray {
	//TC: O(logn)
	//SC: O(1)
	public int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		int ans = nums[0];
		// base case
		if (n == 1) {
			return nums[0];
		}
		if (nums[0] != nums[1]) {
			return nums[0];
		}

		if (nums[n - 1] != nums[n - 2]) {
			return nums[n - 1];
		}
		int low = 1;
		int high = n-2;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) {
				return nums[mid];
			}
			//check at odd index & then at even index
			if((mid%2 == 1 && nums[mid] == nums[mid-1]) ||
			   (mid%2 == 0 && nums[mid] == nums[mid+1])) {
				//eliminate left half
				low = mid + 1;
			}
			else {
				//do not check at even index & then at odd index, remaining checks will be for both
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

//Naive approach
// TC: O(n)
// SC: O(1)
//  public int singleNonDuplicate(int[] nums) {
//     int n = nums.length;
//		int ans = nums[0];
//		//base case
//      if(n == 1) {
//          return nums[0];
//      }
//      //two edge cases
//      if(nums[0] != nums[1]) {
//          return nums[0];
//      }
//      
//      if(nums[n-1] != nums[n-2]) {
//          return nums[n-1];
//      }
//		for(int i=1; i <= n-2; i++) {
//			if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
//				ans = nums[i];
//				break;
//			}
//		}
//		return ans; 
//  }