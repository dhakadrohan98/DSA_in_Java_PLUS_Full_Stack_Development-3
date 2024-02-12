package org.coding.arr;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
	
	public static int removeDuplicates(int[] nums) {
		
		Map<Integer,Integer> hmap = new HashMap<>();
		int count=0;
		int[] tempArr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(!hmap.containsKey(nums[i])) {
				hmap.put(nums[i], 1);
			}
		}
		System.out.println(hmap);
		int j=0;
		for(int i=0; i<nums.length; i++) {
			if(hmap.containsKey(nums[i]) && hmap.get(nums[i]) == 1) {
				//setting 0 value to key
				hmap.put(nums[i], 0);
				tempArr[j] = nums[i];
				j++;
				count++;
			}
		}
		
		for(int k=0; k<tempArr.length; k++) {
			nums[k] = tempArr[k];
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int removeDuplicates = removeDuplicates(nums);
		System.out.println("Result: "+removeDuplicates);
		
		for(int num:nums) {
			System.out.println(num);
		}
		
	}

}
