package com.sorting;

public class InsertionsSort {

	public static void main(String[] args) {
		int[] arr = {7,8,5,2,4,6,3};
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		for(int itr:arr) {
			System.out.print(itr + " ");
		}

	}

}
