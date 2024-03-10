package org.bits.manipulation;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for num: ");
		int num = sc.nextInt();
		//use of & operator in even-odd problem
		if((num & 1) == 1) {
			System.out.println("Given no." + num + " is odd");
		}
		else {
			System.out.println("Given no." + num + " is even");
		}

	}

}
