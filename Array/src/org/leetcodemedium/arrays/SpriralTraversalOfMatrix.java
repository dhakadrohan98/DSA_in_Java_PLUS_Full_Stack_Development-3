package org.leetcodemedium.arrays;

public class SpriralTraversalOfMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length; //no. of rows
        int m = matrix[0].length; //no. of columns
        int left = 0, right = m-1; //columns traversing
        int top = 0, bottom = n-1; //rows traversing
        List<Integer> list = new ArrayList<Integer>();
        
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top; i<= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom) {
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right) {
                for(int i=bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
