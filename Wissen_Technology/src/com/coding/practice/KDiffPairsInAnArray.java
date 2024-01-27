package com.coding.practice;

import java.util.ArrayList;
import java.util.HashMap;

//{3,1,4,1,5}

public class KDiffPairsInAnArray {

	public static void main(String[] args) {
		int[] nums = {1,3,1,5,4};
		int k=0;
		ArrayList<Integer> list = null;
		
		int count=0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
        //constructing hashmap
        for(int i=0; i<nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                int val = hmap.get(nums[i]);
                hmap.put(nums[i], val+1);
            }
            else {
                hmap.put(nums[i], 1);
            }
        }
        System.out.println(hmap);
        System.out.println();
        
        //main logic
        for(int j=0; j<nums.length; j++) {
        	
        	int n1 = nums[j];
        	int n2 = Math.abs(n1-k);
        	System.out.println("Iteration: " + (j+1));
        	System.out.println("n1: "+n1);
        	System.out.println("n2: "+n2);
        	
        	if(hmap.containsKey(n2) && hmap.get(n2) >= 1) {
        		count++;
        		hmap.remove(n2);
        		System.out.println("count: "+count);
        		System.out.println(hmap);
        	}
        }
        System.out.println(count);

	}

}
