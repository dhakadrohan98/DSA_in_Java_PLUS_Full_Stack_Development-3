package org.codeship.binarysearch;

public class LowerBound {

	public static int lowerBound(int []arr, int n, int x) {
        int start = 0;
        int end = arr.length-1;
        int ans = n;


        while(start <= end) {
            int mid = (start+end)/2;


            if(arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
