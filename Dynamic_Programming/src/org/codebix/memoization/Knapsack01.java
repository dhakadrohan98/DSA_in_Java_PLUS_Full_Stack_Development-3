package org.codebix.memoization;

import java.util.*;

public class Knapsack01 {

	public static int findKnapsack(int weights[], int values[], int maxWeight) {
		HashMap<String, Integer> mhm = new HashMap<>();
		return findKnapsackHelperR(weights, values, maxWeight, 0);
	}

	
	public static int findKnapsackHelperR(int weights[], int values[], int maxWeight, int i) {
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}
		if (weights[i] > maxWeight) {
			return findKnapsackHelperR(weights, values, maxWeight, i + 1);
		} else {
			int op1 = values[i] + findKnapsackHelperR(weights, values, maxWeight - weights[i], i + 1);
			int op2 = findKnapsackHelperR(weights, values, maxWeight, i + 1);

			return Math.max(op1, op2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
