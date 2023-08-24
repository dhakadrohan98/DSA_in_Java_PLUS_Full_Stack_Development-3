package com.kumar.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RecursiveDepthFirstSeach {

   private LinkedList<Integer>[] adj;
   private int V; // number of vertices
   private int E; // number of edges

   public RecursiveDepthFirstSeach(int nodes) {
      this.V = nodes;
      this.E = 0;
      this.adj = new LinkedList[nodes];
      for (int v = 0; v < V; v++) {
         adj[v] = new LinkedList<>();
      }
   }

   public void addEdge(int u, int v) {
      adj[u].add(v);
      adj[v].add(u);
      E++;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(V + " vertices, " + E + " edges " + "\n");
      for (int v = 0; v < V; v++) {
         sb.append(v + ": ");
         for (int w : adj[v]) {
            sb.append(w + " ");
         }
         sb.append("\n");
      }
      return sb.toString();
   }

   public void dfs() {
      boolean[] visited = new boolean[V];
      for (int v = 0; v < V; v++) {
         if (!visited[v]) {
            dfs(v, visited);
         	}
      }
   }

   // Recursively call dfs(v,visited) on adjacent nodes of 'v' node
   private void dfs(int v, boolean[] visited) {
      visited[v] = true;
      System.out.print(v + " ");
      for (int w : adj[v]) {
         if (!visited[w]) {
            dfs(w, visited);
         }
      }
   }

   public static void main(String[] args) {
	  int nodes = 6;
	  RecursiveDepthFirstSeach g = new RecursiveDepthFirstSeach(nodes);
	  boolean[] visited = new boolean[nodes];
	  g.addEdge(2, 3);
	  g.addEdge(2, 4);
      g.addEdge(0, 3);
      g.addEdge(0, 1);
      g.addEdge(2, 1); 
      g.addEdge(5, 5);
      System.out.println(g);
      //passing starting node as 0
      g.dfs();
   }
}