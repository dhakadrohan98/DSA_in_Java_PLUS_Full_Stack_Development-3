package com.coding.practice;

import java.util.*;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		String str = "aabbcde";
		HashMap<Character,Integer> hmap = new HashMap<>();
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			} else {
				hmap.put(ch, 1);
			}
		}
		
		for(int j=0; j<str.length(); j++) {
			char sub = str.charAt(j);
			
			if(hmap.get(sub) == 1) {
				flag = true;
				System.out.println(j);
				break;
			}
		}
		
		if(!flag) {
			System.out.println(-1);
		}

	}

}
