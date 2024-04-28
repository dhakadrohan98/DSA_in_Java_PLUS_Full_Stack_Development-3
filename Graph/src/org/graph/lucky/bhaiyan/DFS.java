package org.graph.lucky.bhaiyan;

import java.util.*;

public class DFS {

	public static void main(String[] args) {
		boolean[][] mat = new boolean[5][5];
		//Adjacency matrix
		mat[0][1] = true;
		mat[1][0] = true;
		mat[1][2] = true;
		mat[2][1] = true;
		mat[2][3] = true;
		mat[3][2] = true;
		mat[3][4] = true;
		mat[4][3] = true;
		
//		for(int i = 0; i<mat.length; i++) {
//			for(int j = 0; j < mat[0].length; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}
		Set<Integer> set = new HashSet<>();
		
		int start = 0;
		while(start < mat.length) {
			for(int j = 0; j < mat[0].length; j++) {
				if(mat[start][j] == true) {
					set.add(start);
				}
			}
			start++;
		}
		
		System.out.println(set);

	}

}
