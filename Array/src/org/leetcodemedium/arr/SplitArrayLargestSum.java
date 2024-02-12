package org.leetcodemedium.arr;

import java.util.ArrayList;
import java.util.Collections;

public class SplitArrayLargestSum {

	public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size(); // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                // add pages to current student
                pagesStudent += arr.get(i);
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
    
    public static int splitArray(int[] nums, int m) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
            arr.add(nums[i]);
        }
        
        // book allocation impossible
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    
	public static void main(String[] args) {
		int[] nums = {7,2,5,10,8};
		int k = 2;
		System.out.println(splitArray(nums, k));

	}

}
