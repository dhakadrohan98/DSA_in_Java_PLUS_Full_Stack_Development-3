package org.codeship;

public class SearchIn2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; //rows
        int m = matrix[0].length; //columns
        // hypothetically flatten the 2d matrix into 1d array
        // low & high should point to index of flattened array (1d array)
        int low = 0;
        int high = (n * m) - 1; // high = (3 * 4) - 1 = 11;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            int row = mid / m;
            int col = mid % m;
            
            if(matrix[row][col] == target) {
                return true;
            }   
            else if(matrix[row][col] <= target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
