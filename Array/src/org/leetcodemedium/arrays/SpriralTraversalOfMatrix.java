package org.leetcodemedium.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpriralTraversalOfMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length; //no. of rows
        int m = matrix[0].length; //no. of columns
        int left = 0, right = m-1; //columns traversing
        int top = 0, bottom = n-1; //rows traversing
        List<Integer> list = new ArrayList<Integer>();
        int col=0, row=0;
        
        while(top <= bottom && left <= right) {
            col = left;
            while(col <= right && top<=bottom) {
            	list.add(matrix[top][col]);
            	col++;
            }
            top++;
            
            row = top;
            while(row <= bottom && left <= right) {
            	list.add(matrix[row][right]);
            	row++;
            }
            right--;
            
            col = right;
            while(col >= left && top <= bottom) {
            	list.add(matrix[bottom][col]);
            	col--;
            }
            bottom--;
            
            row = bottom;
            while(row >= top && left <= right) {
            	list.add(matrix[row][left]);
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
