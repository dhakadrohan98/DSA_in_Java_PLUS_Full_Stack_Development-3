package com.kumar.graph;

import java.util.Scanner;

public class AjacencyMatrixRepresentation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vertices = sc.nextInt();
//		System.out.print("Enter number of edges: ");
//		int edges = sc.nextInt();
		int[][] arr = new int[vertices+1][vertices+1];
		
		for(int i=1; i<=vertices; i++) {
			for(int j=1; j<=vertices; j++) {
				System.out.println("Enter values for "+i+ " row and "+j+ " column");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=vertices; i++) {
			
			for(int j=1; j<=vertices; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

// arr[5][5] =>::

//    0|1|2|3|4|5|
//   _____________
//  0|0|0|0|0|0|0|
//  1|0|0|1|0|1|1|
//  2|0|1|0|1|0|0|
//	3|0|0|1|0|1|0|
//	4|0|1|0|1|0|1|
//	5|0|1|0|0|1|0|
//
