package org.leetcodemedium.arr.revision;


public class SortColors_TwoPointer {

	//TC: O(n)
	//SC: O(1)
	
	public void sortColors(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len-1;
        int mid = 0;
        while(mid <= end) {
            if(nums[mid] == 0) {
                swap(nums, start, mid);
                start++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, end);
                end--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
	public static void main(String[] args) {}

}
