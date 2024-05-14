package org.graph.lucky.bhaiyan;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
	//TC: O(V+E)
	//SC: O(V)
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean[] visited = new boolean[V];
		// iterate through all components of a graph
		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				boolean ans = dfs(i, -1, visited, adj);
				// if cycle found in the current component.
				if (ans == true) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
		visited[node] = true;
		//explore adjacent nodes(i.e edges) of the curr node.
		ArrayList<Integer> curr = adj.get(node);
		for (int adjNode : curr) {
			if (visited[adjNode] == false) {
				boolean ans = dfs(adjNode, node, visited, adj);
				if (ans == true) {
					return true;
				}
			} else if (adjNode != parent) { // if cycle found at this point.
				return true;
			}
		}
		return false;
	}
}

//inputs:
//EX:1
//adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}}

//EX:2
//adj = {{}, {2}, {1, 3}, {2}}

