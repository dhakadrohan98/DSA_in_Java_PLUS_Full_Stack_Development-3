package com.PreDirectorRound;

import java.util.Scanner;

public class DistributeBananaAmongMonkeys {
	//TC: O(n/2)
	//SC: O(1)
	private static boolean isEqualDistributionPossible(int n) {

		if (n <= 3) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of bananas");
		int bananas = sc.nextInt();
		System.out.println(isEqualDistributionPossible(bananas));
	}
}
