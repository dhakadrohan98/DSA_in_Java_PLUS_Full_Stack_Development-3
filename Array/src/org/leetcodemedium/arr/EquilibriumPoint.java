package org.leetcodemedium.arr;

import java.util.HashMap;

public class EquilibriumPoint {

public static int equilibriumPoint(long arr[], int n) {
        
        if(n == 1) {
			return 1;
		} else if(n == 2) {
			return -1;
		} else {
		    long totalSum = 0;
		    
	        //calculate totalSum
	        for(int i=0; i<n; i++) {
	            totalSum += arr[i];
	        }
	        
	        long previousSum = 0;
	        //main logic
	        for(int i=1; i<n; i++) {
	        	previousSum = previousSum + arr[i-1];
	        	
	        	if( totalSum == (2*previousSum)+arr[i] ) {
	        		return i+1;
	        	}
	        	
	        }
		}
        
        return -1;
    }
	
	public static void main(String[] args) {
		long[] arr = {1,3,5,2,2};
		System.out.println(equilibriumPoint(arr, 5));

	}

}
