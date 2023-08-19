package com.kumar.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch {
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edges;
	
	public DepthFirstSearch(int nodes) {
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
	
	public void DFS(int source, int nodes) {
		boolean[] visited = new boolean[nodes+1];
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			if(visited[u] == false) {
				visited[u] = true;
				System.out.print(u+", ");
				
				for(int v: adj[u]) {
					if(visited[v] == false) {
						stack.push(v);
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int nodes = 5;
		DepthFirstSearch g = new DepthFirstSearch(nodes);
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
		System.out.println("Depth first search-> ");
		g.DFS(0, nodes);

	}
}
