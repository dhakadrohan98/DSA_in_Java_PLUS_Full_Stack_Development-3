package org.recursion.pure.solution;

import java.util.*;

public class MinPathFixedStartingPointVariableEndingPoint {
	public int minimumTotal(List<List<Integer>> triangle) {
		int size = triangle.size();
		return helper(0, 0, triangle, size);
	}

	private static int helper(int i, int j, List<List<Integer>> triangle, int n) {
		//one base case
		if (i == n - 1)
			return triangle.get(n - 1).get(j);

		int down = triangle.get(i).get(j) + helper(i + 1, j, triangle, n);
		int diagonalRightBottom = triangle.get(i).get(j) + helper(i + 1, j + 1, triangle, n);
		return Math.min(down, diagonalRightBottom);
	}
}
