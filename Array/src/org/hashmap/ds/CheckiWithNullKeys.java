package org.hashmap.ds;

import java.util.HashMap;
import java.util.Map;

public class CheckiWithNullKeys {

	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<>();

		hm.put(1, 10);
		hm.put(3, 14);
		hm.put(5, 18);
		hm.put(7, 22);
		//1st check
		if (hm.get(2) == null) {
			System.out.println(true);
		}
		else {
			System.out.println(hm.get(7));
		}
		//2nd check
		if (hm.get(3) == null) {
			System.out.println(true);
		}
		else {
			System.out.println(hm.get(7));
		}

	}

}
