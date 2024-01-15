package com.coding.practice;

public class LongestWordEvenLengthFromString1 {

	public static void main(String[] args) {
		String str = "Be not afraid of greatness, some are born great, some achieve greatness, and some have "
				+ "greatness, and some have greatness thrust upon them";
		int longestWord = 0;
		
		
		String[] arr = str.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			
			String comma = ",";
			if(arr[i].contains(comma)) {
				int length = arr[i].length()-1; 
				if(length % 2 == 0 &&  length > longestWord) {
					longestWord = length;
					System.out.println(arr[i]);
				}
			}
			else {
				if(arr[i].length() % 2 == 0 &&  arr[i].length() > longestWord) {
					longestWord = arr[i].length();
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println(longestWord);
	}

}
