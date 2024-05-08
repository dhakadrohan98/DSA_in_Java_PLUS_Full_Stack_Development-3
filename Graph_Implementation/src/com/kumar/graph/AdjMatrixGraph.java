package com.kumar.graph;

import java.util.Scanner;

public class AdjMatrixGraph {

	   private int V; // number of vertices in Graph
	   private int E; // number of edges in Graph
	   private int[][] adjMatrix;

	   public AdjMatrixGraph(int nodes) {
	      this.V = nodes;
	      this.E = 0;
	      this.adjMatrix = new int[nodes+1][nodes+1];
	   }

	   public void addEdge(int u, int v) {
	      adjMatrix[u][v] = 1;
	      adjMatrix[v][u] = 1; // because it is an undirected graph
	      E++;
	   }

	   public String toString() {
	      StringBuilder sb = new StringBuilder();
	      sb.append(V + " vertices, " + E + " edges " + "\n");
	      for (int v = 0; v < V; v++) {
	         sb.append(v + ": ");
	         for (int w : adjMatrix[v]) {
	            sb.append(w + " ");
	         }
	         sb.append("\n");
	      }
	      return sb.toString();
	   }

	   public static void main(String[] args) {
	      AdjMatrixGraph g = new AdjMatrixGraph(5);
	      g.addEdge(1, 2);
	      g.addEdge(1, 4);
	      g.addEdge(1, 5);
	      g.addEdge(2, 3);
	      g.addEdge(3, 4);
	      g.addEdge(4, 5);
	      System.out.println(g);
	   }
}

// arr[nodes+1][nodes+1] =>::
// 5 vertices, 6 edges

//    0|1|2|3|4|5|
//   _____________
//  0|0|0|0|0|0|0|
//  1|0|0|1|0|1|1|
//  2|0|1|0|1|0|0|
//	3|0|0|1|0|1|0|
//	4|0|1|0|1|0|1|
//	5|0|1|0|0|1|0|
//
