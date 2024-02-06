package org.leetcodemedium.arrays;

import java.util.ArrayList;

public class FactorialOfLargeNumbers {

	public static int multiply(int[] arr, int size, int multiplier) {

		int carry = 0;
		//multiplier = 5;
		//size = 2;
		for (int i = 0; i < size; i++) {	// i = 1;
											// arr[1] = 2; 
			int res = multiplier * arr[i]; // res = 5*2 = 10 ; carry = 2;
			res = res + carry; // res = 10 + 2 = 12;

			arr[i] = res % 10; // arr[1] = 12%10 = 2;
			carry = res / 10; // carry = 12/10 = 1;
		}

		// carry = 0
		while (carry > 0) {

			arr[size] = carry % 10; // arr[2] = 1%10 = 1;
			size++; //size = 3;
			carry = carry / 10; //carry = 1/10 = 0;
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
		int num = 10;
		System.out.println(factorial(num));

	}

}
