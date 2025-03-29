package org.leetcodemedium.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals_BruteForceApproach {

	public int[][] merge(int[][] intervals) {
		int n = intervals.length;
		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] n, int[] m) {
				if (n[0] == m[0]) {
					return n[1] - m[1];
				}
				return n[0] - m[0];
			}
		});

		List<int[]> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			// [15, 18], [16, 17] list.back()[1] =18 | start = 16, end = 17
			if (!list.isEmpty() && end <= list.get(list.size() - 1)[1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (intervals[j][0] <= end) {
					end = Math.max(end, intervals[j][0]);
				} else {
					// no need to check further intervals because all intervals are sorted already
					break;
				}
			}
			int[] temp = new int[2];
			temp[0] = start;
			temp[1] = end;
			list.add(temp);
		}
		
		int[][] res = new int[list.size()][2];
		int k = 0;
		for (int[] itr : list) {
			res[k][0] = itr[0];
			res[k][1] = itr[1];
			k++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
