package org.leetcodemedium.arrays;

public class SecondLargestElement {

	public static int print2largest(int arr[]) {
        
		if(arr.length == 1) {
            return -1;
        }
        int firstLargest = arr[0];
        int secondLargest = -1;
        int i=1;
        
        while(i < arr.length) {
            
            if(firstLargest < arr[i] ) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] < firstLargest  && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            i++;
        }
        return secondLargest;
    }
	
	public static int print2smallest(int[] arr) {
		if(arr.length == 1) {
            return -1;
        }
        int firstSmallest = arr[0];
        int secondSmallest = -1;
        int i=1;
        
        while(i < arr.length) {
            
            if(firstSmallest > arr[i] ) {
            	secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] > firstSmallest  && arr[i] < secondSmallest) {
            	secondSmallest = arr[i];
            }
            i++;
        }
        return secondSmallest;
	}
	
	public static void main(String[] args) {
		int[] nums = {12, 35, 1, 10, 34, 1};
		int print2largest = print2largest(nums);
		System.out.println("second largest: "+ print2largest);
		System.out.println("second smallest: " + print2smallest(nums));

	}

}
