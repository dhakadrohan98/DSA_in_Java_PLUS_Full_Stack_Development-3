package org.graph.lucky.bhaiyan;

import java.util.*;

public class FindIfPathExists {
	//TC: O(N)
	//SC: O(N)
	public static boolean isPath(ArrayList<Integer>[] graph, int source, int destination, boolean[] visited) {
		// base case
		if (source == destination) {
			return true;
		}
		visited[source] = true;

		// visiting all neighbours(to source) nodes, starting for very first time
		for (int nbr : graph[source]) {
			if (visited[nbr] == false) {
				// recursive calls on neighbours one by one.
				if (isPath(graph, nbr, destination, visited)) {
					return true;
				}
			}
		}
		// if no path found from src to dest, then path doesn't exists
		return false;
	}

	// Make Use of Adjacency List
	public static boolean validPath(int n, int[][] edges, int source, int destination) {
		ArrayList<Integer>[] graph = new ArrayList[n];
		// making empty ArrayList objects & assigning to each index of ArrayList array
		// because
		// graph of ArrayList array is assigned null at each indexes.
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int[] edge : edges) {
			int v1 = edge[0];
			int v2 = edge[1]; // Add both into graph array of ArrayList
			graph[v1].add(v2); // v1->v2
			graph[v2].add(v1); // v2->v1
		}

		// printing array of ArrayList<Integer>
		for (ArrayList<Integer> temp : graph) {
			System.out.print(temp);
		}
		System.out.println();

		boolean[] visited = new boolean[n];
		boolean result = isPath(graph, source, destination, visited);
		return result;
	}

	public static void main(String[] args) {
		int[][] edges1 = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
		int v1 = 3;
		System.out.println(validPath(v1, edges1, 0, 2));

		int[][] edges2 = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
	}
}
