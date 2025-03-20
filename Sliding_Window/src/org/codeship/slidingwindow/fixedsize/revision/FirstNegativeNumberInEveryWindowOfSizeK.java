package org.codeship.slidingwindow.fixedsize.revision;

import java.util.*;
public class FirstNegativeNumberInEveryWindowOfSizeK {
	//TC: O(n)
    //SC: O(2n)
    // Function to find the first negative integer in every window of size k
	public static List<Integer> firstNegativeInteger(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        Queue<Integer> queue = new LinkedList<>();
        while(j < nums.length) {
            //do calculation for j
            if(nums[j] < 0) {
                queue.offer(nums[j]);
            }
            
            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                //do calculations for ans
                if(!queue.isEmpty()) {
                    ans.add(queue.peek());
                } else {
                	ans.add(0);
                }
                //remove calculation for i
                if(queue.contains(nums[i])) {
                    queue.poll();
                }
                //slide the window
                i++;
                j++;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int[] nums = {12, -1, -7, 8, -15, 30, 16, 28};
		int k =3;
		System.out.println(firstNegativeInteger(nums, k));
		int[] nums2 = {-8, 2, 3, -6, 10};
		int k2 = 2;
		System.out.println(firstNegativeInteger(nums2, k2));

	}

}
