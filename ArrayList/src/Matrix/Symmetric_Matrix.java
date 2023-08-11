package Matrix;

public class Symmetric_Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = { {2,3,6}, {3,4,5}, {6,4,9} };
		
		System.out.println(isSymmetricMatrix(matrix));

	}

	public static boolean isSymmetricMatrix(int[][] matrix) {
		int[][] trans = new int[matrix[0].length][matrix.length];
		int count = 0;
		
		for(int i=0; i<trans.length; i++)
		{
			for(int j=0; j<trans[0].length; j++)
			{
				trans[i][j] = matrix[j][i];
			}
		}
		
		//Checking elements of both matrix one by one
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j] != trans[i][j])
				{
					count++;
					break;
				}
			}
			if(count == 1)
				break;
		}
		
		if(count == 0)
			return true;
		else
			return false;
	}

}
