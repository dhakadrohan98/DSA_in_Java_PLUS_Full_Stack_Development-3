package org.codeship.slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.List;

//GFG level: medium
public class FirstNegativeNumberInEveryWindowOfSizeK {

	public static List<Long> maximumSubarraySum(long[] nums, int k) {
		if (nums.length < k) {
			return new ArrayList<>();
		}

		int i = 0, j = 0;
		List<Long> list = new ArrayList<>();
		List<Long> ans = new ArrayList<>();

		while (j < nums.length) {
			
			//calculation
			//if current element is negative then add it into the list
			if(nums[j] < 0) {
				list.add(nums[j]);
			}
			System.out.println("List: " + list);
			
			if(j-i+1 < k) {	
				j++;
			} else if(j-i+1 == k) {
				//calculation (add a element to ans List)
				//check whether a list empty or not, it means there is no negative
				//number we got, when we hit the window size k
				if(list.size() == 0) {
					ans.add((long) 0);
				} else {
					//adding first element into list
					ans.add(list.get(0));
				}
				
				if(nums[i] < 0) {
					//Removing ith negative element from list
					list.remove(0);
				}
				i++;
				j++;
			}
		}
		
		long[] res = new long[ans.size()];
		for(int m=0; m<ans.size(); m++) {
			res[m] = ans.get(m);
		}
		
		System.out.println(ans);
		return ans;

	}
	
	public static void main(String[] args) {
		long[] nums = {12, -1, -7, 8, -15, 30, 16, 28};
		long[] nums1 = {-8, 2, 3, -6, 10};
		long[] nums2 = {12, -1, -7, 8, -15, 30, 16, 28};
		List<Long> res = maximumSubarraySum(nums2, 3);
		

	}

}
