package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr =  {5, 1, 12, -5, 16, 2, 12, 14};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int itr:arr) {
			System.out.print(itr + " ");
		}

	}

}
