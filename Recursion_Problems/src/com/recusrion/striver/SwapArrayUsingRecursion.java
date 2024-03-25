package com.recusrion.striver;

public class SwapArrayUsingRecursion {
	// TC: O(n/2)
	// SC: O(n/2) (auxiliary space)
	private static void func(int i, int[] arr, int n) {
		// base case
		if (i >= n / 2) {
			return;
		}
		swap(arr, i, n-1-i);
		func(i+1, arr, n);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		System.out.println("Before swapping");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		func(0, arr, n);

		System.out.println("After swapping");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
