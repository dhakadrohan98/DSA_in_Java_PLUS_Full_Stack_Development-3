package com.practice;

public class Test {

	public static void main(String[] args) {
		String str = "Be not afraid of greatness, some are born great, some achieve greatness, "
				+ "and some have greatness thrust upon them.";
		
		String[] arr = str.split(" ");
		int longestEvenLength = 0;
		String res = "";
		for(int i=0; i<arr.length; i++) {
			int len = arr[i].length();
			if(arr[i].contains(",")) {
				len -= 1;
			}
			if(len % 2 == 0) {
				if(len > longestEvenLength) {
					longestEvenLength = len;
					res = arr[i];
				}
			}
		}
		System.out.println(res);

	}

}
