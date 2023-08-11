package com.searching;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{11, 30, 24, 7, 31, 16, 39, 41};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be searched: ");
		int n = sc.nextInt();
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length;
		boolean flag=false;
		int mid = (start+end)/2;
		
		while(start<=end) {
			
			mid = (start+end)/2;
			if(arr[mid] == n) {
				flag = true;
				break;
			}
			else if(n > arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
		if(flag) {
			System.out.println("value found@ " + (mid+1));
		}
		else {
			System.out.println("value not found");
		}

	}
}
