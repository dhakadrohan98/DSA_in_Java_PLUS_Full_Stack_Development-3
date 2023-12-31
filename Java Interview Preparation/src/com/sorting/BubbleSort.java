package com.sorting;


//Time complexity: O(n^2)
//ST:    O(1)
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		
		for(int num:arr) {
			System.out.print(num+ " ");
		}

	}
	
	public static void swap(int[] arr,int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}

}
