package org.codebix.memoization;

import java.util.Arrays;

public class KnapsackUnbounded01Memoization2Ddp {

	//TC: < O(2^n)
	//SC: O(maxWeight * n)
	public static int knapSack(int n, int maxWeight, int values[], int weights[])
    {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for(int[] temp: dp) {
            Arrays.fill(temp, -1);
        }
        return findKnapsackHelperR(weights, values, maxWeight, 0, dp);
    }
    
    public static int findKnapsackHelperR(int weights[], int values[], int maxWeight, int i, int[][] dp) {
        
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}
		
		if(dp[i][maxWeight] != -1) {
		    return dp[i][maxWeight];
		}
		
		if (weights[i] > maxWeight) {
			return findKnapsackHelperR(weights, values, maxWeight, i + 1, dp);
		} else {
		    int op1 = 0;
		    
		    if(weights[i] <= maxWeight) {
		        op1 = values[i] + findKnapsackHelperR(weights, values, maxWeight - weights[i], i, dp);   
		    }
			int op2 = findKnapsackHelperR(weights, values, maxWeight, i + 1, dp);
            
            int max = Math.max(op1, op2);
            dp[i][maxWeight] = max;
			return max;
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
