package org.leetcodemedium.arr.revision;

import java.util.*;
public class SpiralTraversalOfMatrix {
	
	//TC: O(M*N)
    //SC: O(M*N)
    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer> list = new ArrayList<>();
    
        while(top <= bottom && left <= right ) {
            //1 left to right in upper row
            int col = left;
            while(col <= right && top <= bottom) {
                list.add(mat[top][col]);
                col++;
            }
            top++;

            //2 top to bottom in the last row
            int row = top;
            while(row <= bottom && left <= right) {
                list.add(mat[row][right]);
                row++;
            }
            right--;

            //3 right to left in the last row
            col = right;
            while(col >= left && top <= bottom) {
                list.add(mat[bottom][col]);
                col--;
            }
            bottom--;

            //4 bottom to up in the first row
            row = bottom;
            while(top <= row && left <= right) {
                list.add(mat[row][left]);
                row--;
            }
            left++;
        }
        return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
