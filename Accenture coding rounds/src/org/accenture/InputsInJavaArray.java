package org.accenture;

public class InputsInJavaArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
