package com.coding.practice;
import java.util.*;

public class BalanceStrings1 {

	public static int balanceString(String s1, String s2) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
			
		}
		
		for(int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
			
		}
//		System.out.println(hmap);
		
		for(int i=0; i<s1.length(); i++) {
			
			char ch = s1.charAt(i);
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// Test cases
        System.out.println(balanceString("10", "10"));    // Output: 0
        System.out.println(balanceString("01", "11"));    // Output: 2
        System.out.println(balanceString("111001", "010110"));  // Output: 6
		
	}

}
