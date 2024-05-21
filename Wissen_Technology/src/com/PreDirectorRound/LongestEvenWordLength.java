package com.PreDirectorRound;

public class LongestEvenWordLength {

	public static void main(String[] args) {
		String str = "Be not afraid of greatness, some are born great, some achieve greatness, "
				+ "and some have greatness thrust upon them.";
		String[] arr = str.split(" ");
		int longest = 0;
		
		for(int i=0; i < arr.length-1; i++) {
			int len = arr[i].length();
			
			if(arr[i].contains(",") || arr[i].contains(".")) {
				len = len - 1;
			}
			if(len % 2 == 0) {
				longest = Math.max(longest, len);
			}
		}
		System.out.println("longest even word length is " + longest);

	}

}
