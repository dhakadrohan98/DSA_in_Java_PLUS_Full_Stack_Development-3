package com.recusrion.striver;

import java.util.*;

public class SubsetSums {

	public void func(int indx, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> ds) {
		// base case
		if (indx == N) {
			ds.add(sum);
			return;
		}

		// pick the element
		func(indx + 1, sum + arr.get(indx), arr, N, ds);
		// Not pick up the element
		func(indx + 1, sum, arr, N, ds);
	}

	public ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {

		ArrayList<Integer> ds = new ArrayList<>();
		int indx = 0;
		int sum = 0;
		// calling the recursive function
		func(indx, sum, arr, N, ds);
		Collections.sort(ds);
		return ds;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
