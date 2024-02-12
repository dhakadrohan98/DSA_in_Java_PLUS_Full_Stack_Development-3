package org.coding.arr;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		
		boolean flag=false;
		for(int i=0; i<nums.length; i++) {
			if(target == nums[i]) {
				return i;
			} 
			else if(i+1 < nums.length && target > nums[i] && target < nums[i+1]) {
				return i+1;
			}
			else if(i == (nums.length-1) && target > nums[i]) {
				return i+1;
			}
			else if(i==0 && target < nums[i] ) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = -1;
		int searchInsert = searchInsert(nums, target);
		System.out.println(searchInsert);

	}

}
