package com.recusrion.striver;

public class PrintNto1UsingBacktrack {

	public static void print(int i, int num) {
		//base case
		if (i > num) {
			return;
		}
		print(i + 1, num);
		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		int num = 5;
		print(1, num);
	}

}
