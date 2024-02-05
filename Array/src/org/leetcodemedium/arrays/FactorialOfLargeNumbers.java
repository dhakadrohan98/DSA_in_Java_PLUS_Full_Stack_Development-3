package org.leetcodemedium.arrays;

import java.util.ArrayList;

public class FactorialOfLargeNumbers {

	public static int multiply(int[] arr, int size, int multiplier) {

		int carry = 0;

		for (int i = 0; i < size; i++) {

			int res = multiplier * arr[i];
			res = res + carry;

			arr[i] = res % 10; // 24
			carry = res / 10;
		}

		// carry = 12
		while (carry > 0) {

			arr[size] = carry % 10;
			size++;
			carry = carry / 10;
		}

		return size;
	}

	public static ArrayList<Integer> factorial(int N) {
		int[] arr = new int[10000];

		arr[0] = 1;
		int size = 1;

		for (int multiplier = 2; multiplier <= N; multiplier++) {
			size = multiply(arr, size, multiplier);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = size - 1; i >= 0; i--) {
			list.add(arr[i]);
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
