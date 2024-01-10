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
			int num1 = arr[j];
			int num2 = num1 - k;
			if(hmap.containsKey(num2)) {
				res[0] = num1;
				res[1] = num2;
				break;
			}
			hmap.remove(num1);
			System.out.println(hmap); //printing remaining hmap
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,5,10,6}; //non-repeating integers
		int k = 5;
		
		int[] num = pairWithDifferencK(arr, k);
		for(int temp: num) {
			System.out.println(temp);
		}
		

	}

}
