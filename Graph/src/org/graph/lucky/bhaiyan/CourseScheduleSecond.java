package org.graph.lucky.bhaiyan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CourseScheduleSecond {
	// TC: O(v+e)
	// SC: O(2*v)
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		// forming adjacency list from given prerequisites(2D array)
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < numCourses; i++) {
			// Initialize chid list with null
			adj.add(new ArrayList<Integer>());
		}
		// prerequisites[][] arr have only two columns
		int pre;
		int cour;
		for (int[] pair : prerequisites) {
			pre = pair[1]; //prerequisites course
			cour = pair[0]; //actual course
			adj.get(pre).add(cour); //pre course(parent)
									  //-> actual course (child)
		}

		int n = adj.size();
		int[] ans = new int[numCourses];
		Stack<Integer> st = new Stack<Integer>();
		boolean[] visited = new boolean[numCourses];
		boolean[] helper = new boolean[numCourses];
		boolean isCyclic = false;

		// At first, check for cycle, if found then return empty array otherwise apply
		// topological sort
		// in next step.
		for (int i = 0; i < numCourses; i++) {
			if (visited[i] == false) {
				isCyclic = cycle(adj, visited, helper, i);
				if (isCyclic == true)
					return new int[0];
			}
		}

		// topological sorting algorithm starts from here
		visited = new boolean[n];
		for (int i = 0; i < numCourses; i++) {
			if (visited[i] == false) {
				DFS(adj, i, visited, st);
			}
		}

		int k = 0;
		while (!st.isEmpty())
			ans[k++] = st.pop();

		return ans;
	}

	// topological sorting dfs() logic
	private void DFS(ArrayList<ArrayList<Integer>> adj, int i, boolean visited[], Stack<Integer> st) {
		visited[i] = true;
		ArrayList<Integer> children = adj.get(i);
		for (int k = 0; k < children.size(); k++) {
			int curr = children.get(k);
			if (visited[curr] == false)
				DFS(adj, curr, visited, st);
		}
		// after performing dfs at one entry node then push nodes of that group into
		// stack in a reverse manner.
		st.push(i);
	}

	// detect cycle in directed acyclic graph(DAG)
	private boolean cycle(ArrayList<ArrayList<Integer>> adj, boolean visited[], boolean helper[], int i) {
		visited[i] = true;
		helper[i] = true;

		ArrayList<Integer> children = adj.get(i);
		for (int k = 0; k < children.size(); k++) {
			int curr = children.get(k);
			if (helper[curr] == true)
				return true;
			if (visited[curr] == false) {
				boolean isCyclic = cycle(adj, visited, helper, curr);
				if (isCyclic == true)
					return true;
			}
		}

		helper[i] = false;
		return false;
	}
}
