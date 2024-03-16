package org.codeship;

public class MedianInRowWiseSortedMatrix {

	public static int upperBound(int[] arr, int x, int m) {
		int low = 0;
		int high = m - 1;
		int ans = m;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static int countSmall(int[][] arr, int n, int m, int x) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = count + upperBound(arr[i], x, m);
		}
		return count;
	}
	public static int median(int arr[][], int n, int m) {
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		n = arr.length; // rows
		m = arr[0].length; // columns
		// find min & max from matrix
		for (int i = 0; i < n; i++) {
			low = Math.min(low, arr[i][0]);
			high = Math.max(high, arr[i][m - 1]);
		}
		int req = (n * m) / 2;
		while (low <= high) {
			int mid = (low + high) / 2;
			int smallEqual = countSmall(arr, n, m, mid);
			if (smallEqual <= req) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
