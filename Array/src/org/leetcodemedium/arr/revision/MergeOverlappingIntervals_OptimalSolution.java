package org.leetcodemedium.arr.revision;

import java.util.*;

public class MergeOverlappingIntervals_OptimalSolution {
	
	//Optimal solution
    //TC: O(n*logn) +  O(n) 1 pass
    //SC: O(n)
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
            //curr interval is first interval or non overlapping interval, add curr interval as new
			if(list.isEmpty() || start > list.get(list.size() - 1)[1]) {
                list.add(intervals[i]);
            } else {
                int[] backArr = list.get(list.size() - 1);
                backArr[1] = Math.max(backArr[1], end);
                list.set(list.size() - 1, backArr);
            }
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
