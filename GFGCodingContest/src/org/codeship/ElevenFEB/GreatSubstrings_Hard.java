package org.codeship.ElevenFEB;

import java.util.Arrays;

public class GreatSubstrings_Hard {

	public static long greatCount(int N, String str) {
        int[] nums = new int[N];
        
        //convert an binary string to array of 1s & -1s
        for(int i = 0; i < N; i++) {
            nums[i] = Character.getNumericValue(str.charAt(i));
            if(nums[i] == 0) {
                nums[i] = -1;
            }
        }
        
        int[] prefixSum = new int[N];
        int currSum = 0;
        
        //calculate the prefix sum array
        for(int i = 0; i < N; i++) {
            currSum += nums[i];
            prefixSum[i] = currSum;
        }
        
        //count the number of valid substrings
        long cnt = (int) Arrays.stream(prefixSum).filter(x -> x > 0).count();
        
        //Reverse the prefixSum array
        for(int i = 0; i < N/2; i++) {
            int temp = prefixSum[i];
            prefixSum[i] = prefixSum[N-1-i];
            prefixSum[N-1-i] = temp;
        }
        
        //calculate the number of inversions in the reversed prefixSum
        int inversions = countInversions(prefixSum);
        
        System.out.println("count: " + cnt);
        System.out.println("inversions: " + inversions);
        return cnt + inversions;
    }
    
    public static int countInversions(int[] arr) {
        //calculate the number of inversions using the Modified Merge Sort
        int[] inversions = {0};
        mergeSort(arr, 0, arr.length-1, inversions);
        return inversions[0];
    }
    
    public static void mergeSort(int arr[], int left, int right, int[] inversions) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid, inversions);
			mergeSort(arr, mid + 1, right, inversions);
			merge(arr, left, mid, right, inversions);
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right, int[] inversions) {
	    
	    int[] temp = new int[right - left + 1];
	    int i = left;
	    int j = mid + 1;
	    int k = 0;
	    
	    while(i <= mid && j<= right) {
	        
	        if(arr[i] <= arr[j]) {
	            temp[k] = arr[i];
	            k++;
	            i++;
	        } else {
	            //count the inversion when an element is chosen from the right partition
	            inversions[0] = mid - i + 1;
	            temp[k] = arr[j];
	            k++;
	            j++;
	        }
	   }
	   
	   while(i <= mid) {
	       temp[k] = arr[i];
	       k++;
	       i++;
	   }
	   
	    while(j <= right) {
	       temp[k] = arr[j];
	       k++;
	       j++;
	   }
	   
	   k = 0;
	   for(int index = left; index <=  right;  index++) {
	       arr[index] = temp[k];
	       k++;
	   }
	   
	}
	
	public static void main(String[] args) {
		String str = "11001";
		System.out.println(greatCount(str.length(), str));

	}

}
