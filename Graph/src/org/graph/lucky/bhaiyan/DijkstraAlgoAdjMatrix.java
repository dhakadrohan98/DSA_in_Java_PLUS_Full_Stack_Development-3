package org.graph.lucky.bhaiyan;

import java.util.Scanner;

//TC: O(V^2)
//SC: O(2*V)
public class DijkstraAlgoAdjMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of vertex");
		int V = sc.nextInt();
		System.out.println("Enter total no. of edges");
		int E = sc.nextInt();
		System.out.println("Enter sv, ev & weight (from sv to ev)");
		int[][] adjMat = new int[V][V];
		for (int i = 0; i < E; i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			int weight = sc.nextInt();
			adjMat[sv][ev] = weight;
		}
		System.out.println("Enter source vertex");
		int srcV = sc.nextInt();
		int[] distance = new int[V];
		dijkstra(adjMat, distance, srcV);
		System.out.println("Shortest path from source vertex: " + srcV + "to all other vertexes");
		// print distance array containing shortest path distance from source vertex to all other vertexes.
		for (int i = 0; i < distance.length; i++) {
			System.out.print(distance[i] + " ");
		}
	}
	//main dijkstra algorithm
	public static void dijkstra(int[][] adjMat, int[] distance, int srcV) {
		int V = adjMat.length;
		boolean visited[] = new boolean[V];
		// initialize source vertex with 0.
		distance[srcV] = 0;
		for (int i = 0; i < V; i++) {
			if (i == srcV) {
				continue;
			}
			distance[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < V - 1; i++) {
			int minV = findMinV(distance, visited);
			visited[minV] = true;
			for (int j = 0; j < V; j++) {
				if (adjMat[minV][j] != 0 && visited[j] == false && distance[minV] != Integer.MAX_VALUE) {
					int newDist = distance[minV] + adjMat[minV][j];
					distance[j] = Math.min(distance[j], newDist);

				}
			}
		}
	}
	//find minimum distance vertex from unvisited array category.
	public static int findMinV(int[] distance, boolean[] visited) {
		int minV = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i] && (minV == -1 || distance[i] < distance[minV]))
				minV = i;
		}
		return minV;
	}
}

//Sample input with output ::
//Enter total no. of vertex
//6
//Enter total no. of edges
//7
//Enter sv, ev & weight (from sv to ev)
//0 1 2
//0 3 4
//1 2 3
//1 3 1
//2 5 4
//3 4 2
//4 5 1
//Enter source vertex
//0
//Shortest path from source vertex: 0to all other vertexes
//0 2 5 3 5 6 
