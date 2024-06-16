package org.arrays.stringPracticeProblems;

import java.util.*;

class Pair {
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class HashTableBuilding {

	public static void main(String[] args) {
		int[] nums = {3,1,4,1,5};
		Map<Integer, Pair> hmap = new HashMap<>();
		for(int key: nums) {
			if(!hmap.containsKey(key)) {
				hmap.put(key, );
			}
		}

	}

}
