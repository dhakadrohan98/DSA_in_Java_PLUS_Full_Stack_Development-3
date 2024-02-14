package org.leetcodemedium.arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorialOfLargeNumbers1 {

	public static List<Integer> factorial(int num) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);

		for (int i = 1; i <= num; i++) {
			multiplier(list, i);
		}
		Collections.reverse(list);
		return list;
	}

	public static void multiplier(List<Integer> list, int k) {
		
		int carry = 0;
		
		for (int j = 0; j < list.size(); j++) { // j=1
			int product = list.get(j) * k + carry; // 2 * 5 + 2 = 12
			list.set(j, product % 10); // j=1, 12 % 10 = 2;
            carry = product / 10; // 12 / 10 = 1;
        }

        while (carry != 0) {
            list.add(carry % 10); // list.add(1);
            carry /= 10; // carry = 1 / 10 => carry = 0;
        }
	}
	
	public static void main(String[] args) {
		int num = 6;
		System.out.println(factorial(num));

	}

}
