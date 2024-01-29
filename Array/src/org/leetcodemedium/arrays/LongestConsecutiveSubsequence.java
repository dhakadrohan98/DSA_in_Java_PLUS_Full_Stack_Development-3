package org.leetcodemedium.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

	public static int findLongestConseqSubseq(int arr[])
	{
	  HashSet<Integer> set = new HashSet<>();
	  int longestCount = 1;
	  
	  for(int i=0; i<arr.length; i++) {
		  if(!set.contains(arr[i])) {
			  set.add(arr[i]);
		  }
	  }
	  
	 for(int element: set) {
		 
		 if(!set.contains(element-1)) {
			 int count = 1;
			 int x = element;
			 while(set.contains(x+1)) {
				 x = x + 1; //next number of series
				 count += 1;
			 }
			 longestCount = Math.max(longestCount, count);
		 }
	 }
	  
	  return longestCount;
	  //TC: O(n) : one pass
	  //SC: O(n)
	  
	}
	
	public static void main(String[] args) {
		int[] nums = {102, 4, 100, 1, 101, 3, 2, 1, 1};
		int[] nums1 = {2,6,1,9,4,5,3};
		int[] nums2 = {1,9,3,10,4,20,2};
		System.out.println("Longest sequence length: " + findLongestConseqSubseq(nums2));
	}
}

//if(arr.length == 1) {
//	   return 1;
//}
//HashMap<Integer, Integer> hmap = new HashMap<>();
//HashMap<Integer, Integer> hmap1 = new HashMap<>();
//int count=0;
//boolean prevFlag = false;
//boolean nextFlag = false;
//
//for(int i=0; i<arr.length; i++) {
//	   hmap.put(arr[i], i);
//}
//
//for(int i=0; i < arr.length; i++) {
//	   int curr = arr[i];
//	   int prev = arr[i]-1;
//	   int next = arr[i]+1;
//	   
//	   if( !hmap1.containsKey(curr) && hmap.containsKey(curr) ) {
//		   if(!hmap.containsKey(prev) && hmap.containsKey(next) && nextFlag==false ) {
//			   nextFlag = true;
//			   hmap1.put(arr[i], i);
//			   count++;
//		   }
//		   else if(!hmap.containsKey(next) && hmap1.containsKey(prev) && prevFlag==false) {
//			   prevFlag = true;
//			   hmap1.put(arr[i], i);
//			   count++;
//		   }
//		   else if( hmap.containsKey(prev) && hmap.containsKey(next) ) {
//			   hmap1.put(arr[i], i);
//			   count++;
//		   }
//	   }
//}
//System.out.println(hmap1);
//return count;
