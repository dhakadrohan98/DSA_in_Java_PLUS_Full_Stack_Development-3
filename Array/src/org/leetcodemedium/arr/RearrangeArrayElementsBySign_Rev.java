package org.leetcodemedium.arr;

public class RearrangeArrayElementsBySign_Rev {
	
	 //TC: O(n)
    //SC: O(n)
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                positive[pos++] = nums[i]; 
            } else {
                negative[neg++] = nums[i]; 
            }
        }
        pos = 0;
        neg = 0;
        int k = 0;
        boolean posFlag = true;
        while(k < n) {
            if(posFlag) {
                nums[k++] = positive[pos++];
            } else {
                nums[k++] = negative[neg++];
            }
            posFlag = !posFlag;
        }
        return nums;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
