package org.string.leetcode.mediumProblems;

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String str) {
		String res = "";
		//testing odd length palindrome
		for(int axis = 0; axis < str.length(); axis++) {
			int orbit = 1;
			int len = 1;
			
			while((axis - orbit) >= 0 && (axis + orbit) < str.length()) {
				if(str.charAt(axis-orbit) == str.charAt(axis+orbit)) {
					orbit++;
					len += 2; //length of palindromic substring
				} else {
					break;
				}
			}
			
			if(len > res.length()) {
				int start = axis - len / 2;
				res = str.substring(start, start+len);
			}
		}
		
		//testing even lengths palindrome
		for(int axis=0; axis < str.length() - 1; axis++) {
			int orbit = 1;
			int len = 0;
			
			while(axis-orbit+1 >= 0 && (axis+orbit) < str.length()) {
				if(str.charAt(axis-orbit+1) == str.charAt(axis+orbit)) {
					orbit++;
					len += 2;
				} else {
					break;
				}
			}
			
			if(len > res.length()) {
				int start = axis - len/2 + 1;
				res = str.substring(start, start+ len);
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		String str = "element";
		String longestPalindrome = longestPalindrome(str);
		System.out.println(longestPalindrome);
	}
		
		//Time limit exceed. TC: O(n^3)
//		String str="cbbd";
//		int len = str.length();
//		int longest = 0;
//		String ans = "";
//		
//		for(int i=0; i<len; i++) {
//			for(int j=i+1; j<len+1; j++) {
//				String substring = str.substring(i,j);
//				System.out.print(substring + "  ");
//				StringBuilder sb = new StringBuilder(substring);
//				sb = sb.reverse();
//				if(sb.toString().equals(substring)) {
//					if(longest < sb.toString().length()) {
//						longest = sb.toString().length();
//						int start = i;
//						int end = j;
//						ans = str.substring(start,end);
//					}
//					
//				}
//			}
//			System.out.println();
//		}
//		System.out.println(ans);
//		System.out.println(longest);
		
//		String str = "  -34509words ";
//		str = str.strip();
//		System.out.println(str);
//		
//		if (str.charAt(0) == '+' || str.charAt(0) == '-')
//			str = str.substring(1);
//		
//		char[] words = str.toCharArray();
//		
//		for(char c: words) {
//			if(Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <= 9 ) { // c-'9' <= 0 it means it is digit
//				System.out.println(Character.getNumericValue(c));
//			}
//		}

}
