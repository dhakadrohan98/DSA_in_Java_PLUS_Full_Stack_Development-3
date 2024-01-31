package org.leetcodemedium.arrays;

public class RotateMatrixBy90Degree {

	public static void rotate(int[][] matrix) {
	      int n = matrix.length;
	      
	      for(int i=0; i<n-1; i++) {
	          for(int j=i+1; j<n; j++) {
	              int temp = matrix[i][j];
	              matrix[i][j] =  matrix[j][i];
	               matrix[j][i] = temp;
	          }
	      }
	      //Reversing each row of matrix
	      for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix.length; j++) {
	            	int temp = 0;
	                temp = matrix[i][j];
	                matrix[i][j] = matrix[i][matrix.length - 1 - j];
	                matrix[i][matrix.length - 1 - j] = temp;
	            }
	      }
	      
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		rotate(matrix);
		
		System.out.println("Final o/p:");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
