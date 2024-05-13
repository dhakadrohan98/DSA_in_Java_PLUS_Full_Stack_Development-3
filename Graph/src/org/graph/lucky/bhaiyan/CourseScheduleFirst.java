package org.graph.lucky.bhaiyan;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleFirst {
	//TC: O(E+V)
    //SC: O(V)
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		// forming adjacency list from given prerequisites(2D array)
		List<List<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < numCourses; i++) {
			// Initialize chid list with null
			adj.add(new ArrayList<Integer>());
		}
		// prerequisites[][] arr have only two columns
		for (int i = 0; i < prerequisites.length; i++) {
			int x = prerequisites[i][0];
			int y = prerequisites[i][1];
			// To take course x you should have finished course y
			adj.get(x).add(y);
		}

		// Cycle check
		boolean[] visited = new boolean[numCourses];
		boolean[] helper = new boolean[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (visited[i] == false) {
				// pick first node of different components & then apply DFS on this node
				boolean isCycle = cycle(adj, i, visited, helper);
				// if cycle detected then return true from here
				if (isCycle == true)
					return false; // course can't be studied this way.
			}
		}
		// if cycle is not found then return true.
		return true;
	}

	private boolean cycle(List<List<Integer>> adj, int i, boolean[] visited, boolean[] helper) {
		visited[i] = true;
		helper[i] = true;
		List<Integer> neighbours = adj.get(i);// store all neighbour nodes into ArrayList
		for (int k = 0; k < neighbours.size(); k++) {
			int curr = neighbours.get(k);
			// if cycle detected then return true from here.
			if (helper[curr] == true)
				return true;
			if (visited[curr] == false) {
				boolean ans = cycle(adj, curr, visited, helper);
				if (ans == true)
					return true;
			}
		}
		// mark unvisit the current node while performing backtracking in DFS (DFS in
		// reverse order through backtracking)
		helper[i] = false;
		return false;
	}
}
