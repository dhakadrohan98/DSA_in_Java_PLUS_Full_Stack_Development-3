package org.graph.lucky.bhaiyan;

import java.util.*;

public class TopologicalSort {
	//TC: O(V+E)
	//SC: O(V)
	public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		int[] ans = new int[V];
		Stack<Integer> st = new Stack<>();
		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				topoHelper(i, visited, adj, st);
			}
		}
		// pop element from stack & store into ans array
		int k = 0;
		while (!st.isEmpty()) {
			ans[k++] = st.pop();
		}
		return ans;
	}

	private static void topoHelper(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
		// iterating through connected nodes of its parent node
		for (int val : adj.get(i)) {
			if (visited[val] == false) {
				visited[val] = true;
				topoHelper(val, visited, adj, st);
			}
		}
		// after performing dfs at one entry node then push nodes of that group into
		// stack in a reverse manner.
		st.push(i);
	}
}

//Sample inputs:
//EX:1
//adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}}

//EX:2
//adj = {{}, {2}, {1, 3}, {2}}
