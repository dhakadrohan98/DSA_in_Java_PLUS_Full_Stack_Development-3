package com.kumar.graph;

import java.util.*;

public class AdjListRepresentation {

	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edges;
	
	public AdjListRepresentation(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adj = new LinkedList[nodes+1];
		for(int i=1; i<=nodes; i++) {
			this.adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		this.edges++;
	}
	
	@Override
	public String toString() {
		return "AdjListRepresentation [adj=" + Arrays.toString(adj) + "]";
	}

	public static void main(String[] args) {
		int nodes = 5;
		AdjListRepresentation g = new AdjListRepresentation(nodes);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);
		
		for(int i=1; i<=nodes; i++) {
			System.out.print(i+"-> ");
			System.out.println(g.adj[i]);
		}
		System.out.println("Totla number of edges: "+g.edges);

	}

}
