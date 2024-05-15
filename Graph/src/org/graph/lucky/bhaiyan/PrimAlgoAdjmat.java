package org.graph.lucky.bhaiyan;

import java.util.Scanner;

//TC: O(V^2)
//SC: O(V^2) + O(V)
public class PrimAlgoAdjmat { //using Adjacency matrix
	
	private static void prim(int[][] adjMat, int srcV, int V) {
		int[] parent = new int[V];
		int[] weight = new int[V];
		boolean[] visited = new boolean[V];
		// initialize parent with -1, weight with Integer.MAX_VALUE(infinity) and
		// visited with false
		// values.
		for (int i = 0; i < V; i++) {
			parent[i] = -1;
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		// initialize source vertex weight with 0.
		weight[srcV] = 0;
		// iterate through all vertexes except last one.
		for (int i = 0; i < V - 1; i++) {
			// get minimum weight of vertex which is unvisited.
			int minV = minWeight(weight, visited);
			visited[minV] = true;
			// check with all vertexes with minV vertex.
			for (int j = 0; j < V; j++) {
				if (adjMat[minV][j] != 0 && visited[j] == false && adjMat[minV][j] < weight[j]) {
					parent[j] = minV;
					weight[j] = adjMat[minV][j];
				}
			}
		}
		printMST(parent, adjMat);
	}

	private static int minWeight(int[] weight, boolean[] visited) {
		int V = weight.length;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < V; i++) {
			if (visited[i] == false && weight[i] < min) {
				min = weight[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	private static void printMST(int[] parent, int[][] adjMat) {
		for (int i = 1; i < parent.length; i++) {
			System.out.println(parent[i] + " : " + "--> " + adjMat[i][parent[i]]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of vertexes: ");
		int V = sc.nextInt();
		System.out.println("Enter total no. of edges: ");
		int E = sc.nextInt();
		// build undirected weighted graph
		int[][] adjMat = new int[V][V];
		System.out.println("Enter sv, ev & weight (from sv to ev):-");
		for (int i = 0; i < E; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjMat[v1][v2] = weight;
			adjMat[v2][v1] = weight;
		}
		System.out.println("Enter source vertex(srcV):-");
		int srcV = sc.nextInt();
		prim(adjMat, srcV, V);
	}
}
