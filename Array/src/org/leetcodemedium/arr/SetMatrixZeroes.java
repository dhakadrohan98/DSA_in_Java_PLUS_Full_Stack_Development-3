package org.leetcodemedium.arr;

public class SetMatrixZeroes {

	 public static void setZeroes(int[][] matrix) {
		 int length= matrix.length;
		 int breadth= matrix[0].length;
		 int result[][] = new int[length][breadth];
		 
		 //copying matrix elements into result array
		 for(int i=0; i<matrix.length; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					result[i][j] = matrix[i][j];
				}
			}
		 
		 //main logic
	        for(int i=0; i<matrix.length; i++) {
	            for(int j=0; j<matrix[i].length; j++) {
	            	
	            	if(matrix[i][j] == 0) {
	            		int row = i;
		            	int column = j;
	            		System.out.println("i: " + i + " j: " + j);
		            		//setting zeroes starting
		            		//going one row back
		            		while(row-1 >= 0) {
		            			row = row - 1;
		            			result[row][column] = 0;
		            		}
		            		//going one row forward
		            		while(row+1 < result.length) {
		            			row = row + 1; 
		            			result[row][column] = 0;
		            		}
		            		//initialize row with i again to go back to matrix[i][j] position
		            		row = i;
		            		//going one column back
		            		while(column-1 >= 0) {
		            			column = column - 1;
		            			result[row][column] = 0;
		            		}
		            		//going one column forward
		            		while(column+1 < result[i].length) {
		            			column = column + 1; 
		            			result[row][column] = 0;
		            		}
		            		//initialize row with j again to go back to matrix[i][j] position
		            		column = j;
	           }
	       }
	    }
	        
	        
	        for(int i=0; i<matrix.length; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					matrix[i][j] = result[i][j];
				}
			}
	 }
	 
	public static void main(String[] args) {
		int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
		
		int[][] nums2 = {
				         {0,1,2,0},
						 {3,4,5,2}, 
						 {1,3,1,5}
						 };
		
		//Initial array
		for(int i=0; i<nums2.length; i++) {
			for(int j=0; j<nums2[i].length; j++) {
				System.out.print(nums2[i][j] + " ");
			}
			System.out.println();
		}
		
		setZeroes(nums2);
		
		for(int i=0; i<nums2.length; i++) {
			for(int j=0; j<nums2[i].length; j++) {
				System.out.print(nums2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
