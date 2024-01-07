package com.coding.practice;

import java.util.*;

public class PairFromArrayWithDifferenceK {
	
	public static int[] pairWithDifferencK(int[] arr, int k) {
		int[] res = new int[2];
		Map<Integer,Integer> hmap = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			hmap.put(arr[i], i);
		}
		System.out.println(hmap);
		
		for(int j=0; j<arr.length; j++) {
			int diff = arr[j] - k;
			if(hmap.containsKey(diff)) {
				res[0] = arr[j];
				res[1] = diff;
				break;
			}
			hmap.remove(arr[j]);
			System.out.println(hmap);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,5,10,6}; //non-repeating integers
		int k = -5;
		
		int[] num = pairWithDifferencK(arr, k);
		for(int temp: num) {
			System.out.println(temp);
		}
		

	}

}
