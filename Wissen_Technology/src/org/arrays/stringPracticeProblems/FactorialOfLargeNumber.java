package org.arrays.stringPracticeProblems;

import java.util.*;

public class FactorialOfLargeNumber {
	//TC: O(n^2)
	//SC: O(n!) auxiliary space
	public static ArrayList<Integer> factorial(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);

		for (int i = 2; i <= num; i++) {
			multiplier(list, i);
		}
		Collections.reverse(list);
		return list;
	}

	public static void multiplier(List<Integer> list, int k) {

		int carry = 0;

		for (int j = 0; j < list.size(); j++) {
			int product = list.get(j) * k;
			product = product + carry; // temp = 20;
			list.set(j, product % 10); // 6 % 10 = 6;
			carry = product / 10; // 6 / 10 = 0;
		}

		while (carry != 0) {
			list.add(carry % 10);
			carry = carry / 10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
