package com.string;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "tgzonrrftzq";
		String str2 = "tqzzrtnrftg";
		boolean flag = true;
		
		Map<Character,Integer> hmap= new HashMap<>();
		
		if(str1.length() != str2.length()) {
			System.out.println("Two given strings are not anagram");
		}
		
		else {
		
			for(int i=0; i<str1.length(); i++) {
				char ch = str1.charAt(i);
				
				if(hmap.containsKey(ch)) {
					hmap.put(ch, hmap.get(ch)+1);
				}
				else {
					hmap.put(ch,1);
				}
			}
			System.out.println("Built map: " + hmap);
			
			for(int i=0; i<str2.length(); i++) {
				char ch = str2.charAt(i);
				
				if(!hmap.containsKey(ch) || hmap.get(ch)==0) {
					flag = false;
					break;
				}
				else {
					hmap.put(ch, hmap.get(ch)-1);
				}
			}
			
			if(flag==false) {
				System.out.println("Two given strings are not anagram");
			}
			else {
				System.out.println("Two given strings are Anagram");
			}
		}
	}
}
