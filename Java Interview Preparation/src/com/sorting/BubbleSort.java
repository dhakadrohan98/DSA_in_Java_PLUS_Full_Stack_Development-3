package com.sorting;


//Time complexity: O(n^2)
//ST:    O(1)
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {13,32,25,35,10};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+ " ");
		}

	}
	
	public static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
