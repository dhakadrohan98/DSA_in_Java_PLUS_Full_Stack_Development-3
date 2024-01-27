package com.codeship.extra;

public class LongestConsecutiveSequenceMain {

	public static int logestConsecutiveSequence(int[] nums) {
		//int i=0;, j=1, longestCount=0, count=1;
		//iterate through i & j whenever arr[i+1] == arr[j]
		//increment j only in two cases: (i) arr[i+1] == arr[j]
												//increment count
										 //(ii) arr[i+1] != arr[j]
												//if (longestCount < count) {
		//}
													//  count=1;
													// i++, j++;
		
		int i=0, j=1;
		int count=1, longestCount=0;
		while(i< nums.length-1 && j < nums.length) {
			
			System.err.println("Iteration: "+ i);
			if(nums[i]+1 == nums[j]) {
				count++;
				if (longestCount < count) {
					longestCount = count;
					System.out.println("longestCount: " + longestCount);
				}
				System.out.println("count: " + count);
			}
			else {
				if (longestCount < count) {
					longestCount = count;
					System.out.println("longestCount: " + longestCount);
				}
				count = 1;
			}
			i++;
			j++;
		}
		return longestCount;
	}
	
	public static void main(String[] args) {
		int[] arr = {100,4,200,3,1,2,11,12,13,14,12,21,22,23,24,25,26};
		int longest = logestConsecutiveSequence(arr);
		System.out.println(longest);
		

	}

}
