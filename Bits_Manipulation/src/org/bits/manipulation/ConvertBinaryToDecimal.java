package org.bits.manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		int n = 23;
		List<Integer> list = new ArrayList<>();
		
		while(n > 0) {
			list.add(n % 2);
			n = n >> 1;
		}
		Collections.reverse(list);
		System.out.println(list);

	}

}
