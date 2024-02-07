package com.sorting;

public class QuickSort {
	
	public static int parition(int[] arr, int low,int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;

		System.out.println("pivot: "+ pivot);
		System.out.println("low: "+low);
		System.out.println("high: "+high);
		while(i < j){
			while(arr[i] <= pivot && i <= high-1){
				i++;
			}
			while(arr[j] > pivot && j >= low + 1){
				j--;
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j;
	}

	public static void qs(int[] arr,int low, int high) {
		
		if(low < high) {
			int pIndex = parition(arr, low, high);
			qs(arr, low, pIndex-1);
			qs(arr, pIndex+1, high);
		}
	}
	public static void quickSort(int[] arr,int startIndex, int endIndex) {
		qs(arr, 0, arr.length-1);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,6,2,5,7,9,1,3};
		int[] arr1 = {4,3,8,4,6,5};
//		quickSort(arr, 0, arr.length);
		quickSort(arr1, 0, arr1.length);
		
		for(int temp: arr1) {
			System.out.print(temp+" ");
		}
	}

}
