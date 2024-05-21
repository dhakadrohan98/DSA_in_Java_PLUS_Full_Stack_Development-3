package com.PreDirectorRound;

public class SearchInSortedArray {
	//TC: O(logn)
	//SC: O(1)
	public int search(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n-1;
        //low = 0, high = 6;
        //mid = 3;
        
        //Note: checking target element in sorted half is a key to solve this kind of rotation problem, rotated at a pivot
        while(low <= high) {
            int mid = (low + high) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            //left half is sorted
            if(arr[low] <= arr[mid]) {
              if(arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            //right half is sorted
            else {
                if(arr[mid+1] <= target && target <= arr[high]) {
                  low = mid + 1;  
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
