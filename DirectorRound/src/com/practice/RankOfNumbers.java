package com.practice;

import java.util.*;

public class RankOfNumbers {

	// 100,50,50,60,70,60,90
	
	//rank = 4, i=5
//	map = {
//		{50,1}, {60, 2}, {70,3}, {90, }	
//	}
	
	//TC: O(3*n) = O(n)
	
	public static void main(String[] args) {
		int[] arr = { 100, 50, 50, 60, 70, 60, 90 };
		int n = arr.length;
		int[] copyArr = new int[n];
		
		for(int i=0; i<n; i++) {
			copyArr[i] = arr[i];
		}
		// 50 50 60 60 70 90 100
		Arrays.sort(copyArr);
		Map<Integer, Integer> hmap = new HashMap<>();
		int rank = 1;

		for (int i = 0; i < copyArr.length - 1; i++) {
			if (copyArr[i] == copyArr[i + 1]) {
				continue;
			} else {
				if (!hmap.containsKey(copyArr[i])) {
					hmap.put(copyArr[i], rank);
					rank++;
				}
			}
		}
		// last element
		if (!hmap.containsKey(copyArr[n - 1])) {
			hmap.put(copyArr[n-1], rank);
			rank++;
		}
		System.out.println(hmap);
		for (int i = 0; i < arr.length; i++) {
			if(hmap.containsKey(arr[i])) {
				int val = hmap.get(arr[i]);
				arr[i] = val;
			}
		}
		
		for(int temp: arr) {
			System.out.print(temp + " ");
		}

	}

}
