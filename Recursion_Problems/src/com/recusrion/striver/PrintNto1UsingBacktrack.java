package com.recusrion.striver;

public class PrintNto1UsingBacktrack {
	//TC: O(n)
	//SC: O(n) Stack space
	public static void print(int i, int num) {
		//base case
		if (i > num) {
			return;
		}
		print(i + 1, num);
		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		int num = 4;
		print(1, num);
	}

}
