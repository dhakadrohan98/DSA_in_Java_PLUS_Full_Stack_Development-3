package com.practice;

public class PalindromeSixDigit {
	
	//123321
	//456654
	public static boolean palidrome(int n) {
		int copyNum = n;
		int revNum = 0;
		
		while(copyNum > 0) {
			int remainder = copyNum % 10;
			revNum = revNum * 10 + remainder;
			copyNum = copyNum / 10; 
		}
		if(n == revNum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(palidrome(123321));
		System.out.println(palidrome(124321));

	}

}
