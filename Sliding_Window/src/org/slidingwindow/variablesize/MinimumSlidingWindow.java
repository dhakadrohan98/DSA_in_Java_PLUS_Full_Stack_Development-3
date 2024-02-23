package org.slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class MinimumSlidingWindow {

	 public static String minWindow(String s, String t) {
		 String res = ""; 
		 //base case.
		 //if searched string length is less than target string length.
		 if(s.length() < t.length()) {
			 return "";
		 }
		 //main algorithm
		 //make a map of frequency characters from t string
		 Map<Character, Integer> hmap = new HashMap<>();
		 for(int i=0; i<t.length(); i++) {
			 hmap.put(t.charAt(i), hmap.getOrDefault(t.charAt(i),0)+1);
		 }
		 System.out.println(hmap);
		 
		 int i=0, j=0;
		 int min = Integer.MAX_VALUE;
		 int unique = hmap.size();
		 
		 while(j < s.length()) {
			 char ch = s.charAt(j);
			 
			 
		 }
		 
		 //  
		 return res;
	 }
	 
	public static void main(String[] args) {
		String s = "TOTMTAPTAT";
		String t = "TAT";
		System.out.println(minWindow(s, t));

	}

}
