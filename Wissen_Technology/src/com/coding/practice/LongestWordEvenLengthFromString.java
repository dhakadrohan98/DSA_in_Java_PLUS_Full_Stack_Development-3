package com.coding.practice;

import java.util.concurrent.ExecutorService;

public class LongestWordEvenLengthFromString {

	public static void main(String[] args) {
		String str = "I am a java developer";
		int longestWord = 0;
		
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length() % 2 == 0 && longestWord < arr[i].length()) {
				System.out.println(arr[i]);
				longestWord = arr[i].length();
			}
		}
		System.out.println(longestWord);

	}

}
