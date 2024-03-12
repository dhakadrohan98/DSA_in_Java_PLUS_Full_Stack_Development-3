package org.bits.manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertBinaryToDecimal {
	public static void main(String[] args) {
		int n = 23;
		List<Integer> list = new ArrayList<>();

		while (n > 0) {
			list.add(n % 2);
			n = n >> 1;
		}
		
		for(int i=list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
}
