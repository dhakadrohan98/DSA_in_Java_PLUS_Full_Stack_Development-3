package org.arrays.stringPracticeProblems;

public class SetMatrixZeroes {

	public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //copying elements into result array
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                res[i][j] = matrix[i][j];
            }
        }
        
        //applying operations on deep copy matrix i.e. res
         for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    // setting zeroes cols side
                    //upper side
                    int col = j;
                    while(col-1 >= 0) {
                        res[i][col-1] = 0;
                        col = col - 1;
                    }
                    //lower side
                    col = j;
                    while(col+1 < n) {
                        res[i][col+1] = 0;
                        col = col + 1;
                    }
                    //setting zeroes at rows side
                    //upper side
                    int row = i;
                    while(row-1 >= 0) {
                        res[row-1][j] = 0;
                        row = row - 1;
                    }
                    //lower side
                    row = i;
                    while(row+1 < m) {
                        res[row+1][j] = 0;
                        row = row + 1;
                    }
                }
            }
         }
        
         //copying elements back into orignal matrix
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
