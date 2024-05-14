package org.graph.lucky.bhaiyan;

import java.util.*;

public class DetectCycleInADirectedGraph {
	//TC: O(v+e)
	//SC: O(2*v)
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] helper = new boolean[V];
        for(int i=0; i<V; i++) {
        	if(visited[i] == false) {
        		//pick first node of different components & then apply DFS on this node
        		boolean ans = DFS(adj, i, visited, helper);
        		//if cycle detected then return true from here
        		if(ans == true) return true;
        	}
        }
      //if cycle is not found then return false.
        return false;
    }

	private boolean DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[] helper) {
		visited[i] = true;
		helper[i] = true;
		ArrayList<Integer> neighbours = adj.get(i);//store all neighbour nodes into ArrayList
		for(int k=0; k<neighbours.size(); k++) {
			int curr = neighbours.get(k);
			//if cycle detected then return true from here.
			if(helper[curr] == true) return true;
			if(visited[curr] == false) {
				boolean ans = DFS(adj, curr, visited, helper);
				if(ans == true) return true;
			}
		}
		//mark unvisit the current node while performing backtracking in DFS (DFS in reverse order through backtracking)
		helper[i] = false;
		return false;
	}
}

//inputs:
//EX:1
//adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}}

//EX:2
//adj = {{}, {2}, {1, 3}, {2}}
