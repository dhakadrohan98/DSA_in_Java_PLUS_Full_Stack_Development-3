package com.kumar.graph;

import java.util.LinkedList;

public class ConnectedComponents {

	   private LinkedList<Integer>[] adj;
	   private int V; // number of vertices
	   private int E; // number of edges
	   private boolean[] visited;
	   private int[] compId;
	   private int count;

	   public ConnectedComponents(int nodes) {
	      this.V = nodes;
	      this.E = 0;
	      this.adj = new LinkedList[nodes];
	      for (int v = 0; v < V; v++) {
	         adj[v] = new LinkedList<>();
	      }
	      this.visited = new boolean[nodes];
	      this.compId = new int[nodes];
	      this.count = 0;
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

	public void dfs(int nodes, boolean b) {
		for(int v=0; v<nodes; v++) {
			
			if(!visited[v]) {
				dfs(v);
				this.count++;
			}
		}
	}
	
	public void dfs(int v) {
		this.visited[v] = true;
		System.out.print(v + ", ");
		compId[v] = count;
		
		for(int w: adj[v]) {
			
			if(!visited[w]) {
				dfs(w);
			}
		}
	}
	
	//Return total no. of components
	public int getCount() {
		return this.count;
	}
	
	public boolean isConnected(int u, int v) {
		return compId[u] == compId[v];
	}

	   public static void main(String[] args) {
		  int nodes = 6;
		  ConnectedComponents g = new ConnectedComponents(nodes);
//		  boolean[] visited = new boolean[nodes];
		  g.addEdge(0, 1);
		  g.addEdge(0, 3);
	      g.addEdge(2, 4); 
	      g.addEdge(5, 5);
	      System.out.println(g);
	      //passing starting node as 0
//	      for(int i=0; i<nodes; i++) {
//	    	  System.out.println(visited[i]);
//	      }
	      g.dfs(6,false);
	      System.out.println("***************");
	      System.out.println("Total no. of components-> "+g.getCount());
	      System.out.println(g.isConnected(0,5));
	   }
}
