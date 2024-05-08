package com.kumar.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// BFS--> Level order traversal
public class BreadthFirstSearch {
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edges;
	
	public BreadthFirstSearch(int nodes) {
		this.vertices = nodes;
		this.edges = 0;
		this.adj = new LinkedList[nodes];
		for(int i=0; i<nodes; i++) {
			this.adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
		this.edges++;
	}
	
	public void BFS(int source, int nodes) {
		boolean[] visited = new boolean[nodes+1];
		Queue<Integer> q = new LinkedList<>();
		visited[source] = true;
		q.offer(source);
		
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			for(int v:adj[u]) {
				if(visited[v] == false) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int nodes = 5;
		BreadthFirstSearch g = new BreadthFirstSearch(nodes);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		
		for(int i=0; i<nodes; i++) {
			System.out.print(i+"-> ");
			System.out.println(g.adj[i]);
		}
		System.out.println("Totla number of edges: "+g.edges);
		System.out.print("\n");
		System.out.println("Breadth first search-> ");
		g.BFS(0, nodes);

	}

}
