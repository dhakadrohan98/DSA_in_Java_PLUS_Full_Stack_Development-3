package org.codebix.memoization;

import java.util.*;

//using HashMap
public class KnapsackUnbounded01 {

	public static int knapSack(int n, int maxWeight, int values[], int weights[])
    {
        HashMap<String, Integer> hmap = new HashMap<>();
        return findKnapsackHelperR(weights, values, maxWeight, 0, hmap);
    }
    
    public static int findKnapsackHelperR(int weights[], int values[], int maxWeight, int i, HashMap<String, Integer> hmap) {
        String key = i+""+maxWeight;
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}
		
		if(hmap.containsKey(key)) {
		    return hmap.get(key);
		}
		
		if (weights[i] > maxWeight) {
			return findKnapsackHelperR(weights, values, maxWeight, i + 1, hmap);
		} else {
		    int op1 = 0;
		    
		    if(weights[i] <= maxWeight) {
		        op1 = values[i] + findKnapsackHelperR(weights, values, maxWeight - weights[i], i, hmap);   
		    }
			int op2 = findKnapsackHelperR(weights, values, maxWeight, i + 1, hmap);
            
            int max = Math.max(op1, op2);
            hmap.put(key, max);
			return max;
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
