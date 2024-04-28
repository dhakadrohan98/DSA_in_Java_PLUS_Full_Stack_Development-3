package org.leetcode.gfg.aditya.verma;

import java.util.*;

public class MaximumAreaOfRectangleInBinaryMatrixCorrectCode {
	public int maximalRectangle(char[][] matrix) {
	    if (matrix.length == 0 || matrix[0].length == 0)
	        return 0;

	    int m = matrix.length;
	    int n = matrix[0].length;
	    int[][] heights = new int[m][n + 1]; // Extra column for convenience

	    // Calculate heights for each row
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matrix[i][j] == '1') {
	                heights[i][j] = (i > 0) ? heights[i - 1][j] + 1 : 1;
	            }
	        }
	    }

	    int maxArea = 0;
	    for (int i = 0; i < m; i++) {
	        Stack<Integer> stack = new Stack<>();
	        for (int j = 0; j <= n; j++) {
	            int h = (j == n) ? 0 : heights[i][j];
	            if (stack.isEmpty() || h >= heights[i][stack.peek()]) {
	                stack.push(j);
	            } else {
	                int top = stack.pop();
	                maxArea = Math.max(maxArea, heights[i][top] * (stack.isEmpty() ? j : j - 1 - stack.peek()));
	                j--; // Revisit the same column
	            }
	        }
	    }

	    return maxArea;
	}

}
