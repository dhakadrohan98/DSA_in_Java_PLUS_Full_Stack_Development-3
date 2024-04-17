package org.recursion.solution;

import java.util.Scanner;

public class FlipkartAPIApplicationRunningMinutesP1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // Number of APIs
		int[] apiTimes = new int[N]; // Time taken by each API

		// Read input for API times
		for (int i = 0; i < N; i++) {
			apiTimes[i] = sc.nextInt();
		}

		int M = sc.nextInt(); // Number of applications
		int[] appTimes = new int[M]; // Time taken by each application

		// Initialize application times
		for (int i = 0; i < M; i++) {
			appTimes[i] = 0;
		}

		// Distribute APIs to applications
		for (int i = 0; i < N; i++) {
			int minTime = Integer.MAX_VALUE;
			int minApp = -1;

			// Find the application with minimum time
			for (int j = 0; j < M; j++) {
				if (appTimes[j] < minTime) {
					minTime = appTimes[j];
					minApp = j;
				}
			}

			// Assign the API to the selected application
			appTimes[minApp] += apiTimes[i];
		}

		// Calculate the total time taken
		int totalTime = 0;
		for (int i = 0; i < M; i++) {
			totalTime = Math.max(totalTime, appTimes[i]);
		}

		System.out.println("Total time taken: " + totalTime + " minutes");
	}

}
