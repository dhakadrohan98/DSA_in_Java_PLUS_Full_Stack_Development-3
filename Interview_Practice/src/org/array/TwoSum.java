package org.array;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		Map<Integer,Integer> hmap = new HashMap<>();
		int[] nums = new int[]{3,2,4};
		int target = 6;
		int[] ans = new int[2];
		for(int i=0; i<nums.length; i++) {
			if(!hmap.containsKey(nums[i])) {
				hmap.put(nums[i], i);
			}
			
		}	
		System.out.println(hmap);
		
		for(int j=0; j<nums.length; j++) {
			
			int remain = target - nums[j];
			System.out.println("Remain: "+remain);
			if(hmap.containsKey(remain) && hmap.get(remain)!=j) {
				ans[0] = j;
				ans[1] = hmap.get(remain);
				break;
			}
		}
		
		for(int temp: ans) {
			System.out.print(temp + ", ");
		}
		
		
	}

}
