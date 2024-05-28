package org.arrays.stringPracticeProblems;

import java.util.*;

public class AllocateBook {
	//Linear search
	//TC: O(sum-max) * N
	//@18:12
	public static int findPages(List<Integer> arr, int n, int m) {
		if (m > n) {
			return -1;
		}
		// largest element
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr.get(i));
		}
		System.out.println("max: " + max);
		// sum of arrlist
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr.get(i);
		}
		System.out.println("sum: " + sum);
		// main logic
		for(int pages = max; pages <= sum; pages++) {
			int countStudent = countStudent(arr, pages, m);
			System.out.println("countStudent: " + countStudent + " from pages: " + pages);
			if(countStudent == m) {
				return pages;
			}
		}
		return -1;

	}

	private static int countStudent(List<Integer> arr, int pages, int m) {
		int student = 1;
		int pagesStudent = 0;
		
		for(int i=0; i<arr.size(); i++) {
			if(pagesStudent + arr.get(i) <= pages) {
				pagesStudent += arr.get(i);
			}
			else {
				student++;
				pagesStudent = arr.get(i);
			}
		}
		return student;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(46);
		list.add(28);
		list.add(49);
		list.add(24);
		int n = list.size();
		int m = 4;
		System.out.println(findPages(list,n,m));

	}

}
