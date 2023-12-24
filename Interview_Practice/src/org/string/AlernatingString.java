package org.string;

public class AlernatingString {
	
	//Leetcode: 1758. Minimum Changes To Make Alternating Binary String
	public static int minOperations(String str) {
		int minOps1 = 0, minOps2 = 0;
		String str1 = "", str2 = ""; // str1 & str2 with length=0;
		int length = str.length();

		// str1 starts with 010101
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				str1 += '0';
			} else {
				str1 += '1';
			}
		}
		System.out.println("str1: "+str1);

		// str1 starts with 101010
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				str2 += '1';
			} else {
				str2 += '0';
			}
		}
		System.out.println("str2: "+str2);

		// calculate no. of minOps1 with the help of str1
		for (int j = 0; j < length; j++) {
			if (str.charAt(j) != str1.charAt(j)) {
				minOps1++;
			}
		}
		System.out.println("minOps1: "+minOps1);

		for (int j = 0; j < length; j++) {
			if (str.charAt(j) != str2.charAt(j)) {
				minOps2++;
			}
		}
		System.out.println("minOps2: "+minOps2);
		
		if(minOps1 < minOps2) {
			return minOps1;
		} else {
			return minOps2;
		}
	}

	public static void main(String[] args) {
		String str = "110010";
		int minOperations = minOperations(str);
		System.out.println(minOperations);
		
	}

}
