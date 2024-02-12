package org.coding.arr;

import java.util.Scanner;

public class SplitArrayInChunks {
	
	public static void splitArray(int[] org, int[] subA, int[] subB) {
		
		int i;
		System.out.println("First sub-Array length: "+subA.length);
		System.out.println("Second sub-Array length: "+subB.length);
		//first subArray
		for(i=0; i<subA.length; i++) {
			subA[i] = org[i];
		}
		//second subArray
		for(int j=i, k=0; j<org.length && k<subB.length; j++,k++) {
			subB[k] = org[j];
		}
		//printing both arrays:
		System.out.println("Printing first subarray: ");
		for(int num: subA) {
			System.out.print(num + ", ");
		}
		System.out.println();
		System.out.println("Printing second subarray: ");
		for(int num: subB) {
			System.out.print(num + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
//		int[] arr = new int[size];
		int[] arr = {1};
//		System.out.println("Total array size is " + size + ". Enter its elements");
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		System.out.println("Entered array is: ");
		for(int num:arr) {
			System.out.print(num+ ", ");
		}
		System.out.println();
		
		if(arr.length == 1 || arr.length < size) {
			System.out.println("invalid position");
		} else {
			//main logic
			int mid = arr.length/2;
			System.out.println("mid value:"+ (mid));
			int[] first= new int[mid];
			int[] second= new int[arr.length-(mid)];
			splitArray(arr, first, second);
		}
	}
}
