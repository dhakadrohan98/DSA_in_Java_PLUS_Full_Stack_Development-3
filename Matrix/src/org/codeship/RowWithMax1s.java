package org.codeship;

public class RowWithMax1s {

	public static int countNoOf1s(int[] nums, int m) {

		for (int j = 0; j < m; j++) {
			if (nums[j] == 1) {
				return m - j;
			}
		}
		return 0;
	}

	public static int rowWithMax1s(int arr[][], int n, int m) {

		int count = 0;
		int idx = -1;

		for (int i = 0; i < n; i++) {
			int curr1sCount = countNoOf1s(arr[i], m);

			if (count < curr1sCount) {
				idx = i;
				count = curr1sCount;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
