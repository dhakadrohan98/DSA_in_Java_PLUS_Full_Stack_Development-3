package org.codeship.binarysearch;

import java.util.ArrayList;

public class FindFirstandLastPositionofElementinSortedArray {

	public static int firstOccurrence(int[] arr, int n, int x) {
		int low = 0;
		int high = arr.length - 1;
		int first = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				first = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return first;
	}

	public static int lastOccurrence(int[] arr, int n, int x) {
		int low = 0;
		int high = arr.length - 1;
		int second = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				second = mid;
				low = mid + 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return second;
	}

	public int[] searchRange(int[] arr, int target) {
		int n = arr.length;
		int first = firstOccurrence(arr, n, target);
		int last = lastOccurrence(arr, n, target);

		return new int[] { first, last };

	}

	public static int count(int arr[], int n, int target) {
		int first = firstOccurrence(arr, n, target);
		int last = lastOccurrence(arr, n, target);

		if (first != -1 && last != -1) {
			return (last - first) + 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//code for leetcode:
//public static int lowerBound(int[] arr, int n, int x) {
//	int start = 0;
//	int end = arr.length - 1;
//	int ans = n;
//
//	while (start <= end) {
//		int mid = (start + end) / 2;
//
//		if (!(arr[mid] < x)) {
//			ans = mid;
//			end = mid - 1;
//		} else {
//			start = mid + 1;
//		}
//	}
//	return start;
//}
//
//public static int upperBound(int[] arr, int n, int x) {
//	int low = 0;
//	int high = n - 1;
//	int ans = n;
//
//	while (low <= high) {
//		int mid = (low + high) / 2;
//
//		if (arr[mid] > x) {
//			ans = mid;
//			high = mid - 1;
//		} else {
//			low = mid + 1;
//		}
//	}
//	return low;
//}
//
//public int[] searchRange(int[] arr, int target) {
//	int n = arr.length;
//	int lb = lowerBound(arr, n, target);
//
//	if (lb == n || arr[lb] != target) {
//		return new int[] { -1, -1 };
//	}
//
//	return new int[] { lb, upperBound(arr, n, target) - 1 };
//}

//code for coding ninja studio:
//public static int lowerBound(int []arr, int n, int x) {
//    int start = 0;
//    int end = arr.length-1;
//    int ans = n;
//
//    while(start <= end) {
//        int mid = (start+end)/2;
//
//        if(!(arr[mid] < x)) {
//            ans = mid;
//            end = mid - 1;
//        } else {
//            start = mid + 1;
//        }
//    }
//    return start;
//}
//
//public static int upperBound(int []arr, int n, int x){
//    int low = 0;
//    int high = n-1;
//    int ans = n;
//
//    while(low <= high) {
//        int mid = (low+high)/2;
//
//        if(arr[mid] > x) {
//            ans = mid;
//            high = mid - 1;
//        } else {
//            low = mid + 1;
//        }
//    }
//    return low;
//}
//
//public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int target) {
//	int[] arr1 = new int[n];
//	
//	for(int i=0; i<n; i++) {
//		arr1[i] = arr.get(i);
//	}
//	
//	int lb = lowerBound(arr1, n, target);
//	
//	if(lb == n || arr.get(lb) != target) {
//        return new int[]{-1,-1};
//    }
//    
//    return new int[]{lb, upperBound(arr1, n, target) - 1};
//}
