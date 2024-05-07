package org.graph.lucky.bhaiyan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	// TC: O(N)
	// SC: O(N^2)
	private static void printBFSHelper(int[][] mat, int sv, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(sv);
		visited[sv] = true;
		int v = mat.length;
		while (!q.isEmpty()) {
			int front = q.poll();
			System.out.println(front);
			for (int i = 0; i < v; i++) {
				if (mat[front][i] == 1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
				}
			}
		}

	}

	public static void printBFS(int[][] mat) {
		int v = mat.length;
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (visited[i] == false) {
				printBFSHelper(mat, i, visited);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertexes");
		int vertexes = sc.nextInt();
		System.out.println("Enter no. of edges");
		int edges = sc.nextInt();
		int[][] mat = new int[vertexes][edges];

		for (int i = 0; i < edges; i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			mat[sv][ev] = 1;
			mat[ev][sv] = 1;
		}
		printBFS(mat);

	}

}

//Input:

//Enter no. of vertexes
//7
//Enter no. of edges
//8
//0 1
//0 2
//1 3
//1 4
//2 6
//3 5
//4 5
//6 5
