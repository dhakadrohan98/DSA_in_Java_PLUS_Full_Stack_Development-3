package org.twopointer.revision;

public class ContainerWithMostWater {
	
	//TC: O(n)
    //SC: O(n)
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        int maxArea = 0;
        while(i < j) {
            int height = Math.min(nums[i], nums[j]);
            int length = j - i;
            maxArea = Math.max(maxArea, length * height);
            if(nums[i] <= nums[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
