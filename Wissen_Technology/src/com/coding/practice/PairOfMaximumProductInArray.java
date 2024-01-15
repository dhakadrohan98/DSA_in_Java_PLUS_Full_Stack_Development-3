package com.coding.practice;

import java.util.Arrays;

public class PairOfMaximumProductInArray {

	public static int[] pairOfMaximumProduct(int[] arr) {
		Arrays.sort(arr);
		int length = arr.length;
		int[] num = new int[2];
		
		int start=arr[0]*arr[1];
		int end=arr[length-1]*arr[length-2];
		if(start > end) {
			num[0] = arr[0];
			num[1] = arr[1];
		} else {
			num[0] = arr[length-1];
			num[1] = arr[length-2];
		}
		
		return num;
	}
	public static void main(String[] args) {
		int[] arr = {1,8,3,6,7,0};
		int[] arr1 = {-1,-3,-6,3,0,-5};
		int[] pair = pairOfMaximumProduct(arr);
		int[] pair1 = pairOfMaximumProduct(arr1);
		System.out.print("pair: ");
		for(int temp:pair) {
			System.out.print(temp+ ", ");
		}
		System.out.println();
		System.out.print("pair1: ");
		for(int temp:pair1) {
			System.out.print(temp+ ", ");
		}

	}

}
