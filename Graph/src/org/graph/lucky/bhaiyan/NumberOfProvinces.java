package org.graph.lucky.bhaiyan;

public class NumberOfProvinces {
	//use code template of DFS on adjacency list
	//TC: O(N^2)
	//SC: O(N)
	
	int count = 0;
    public static void printHelper(int adj_mat[][], int sv, boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int v = adj_mat.length;
		for (int i = 0; i < v; i++) {
			if (adj_mat[sv][i] == 1 && visited[i] == false)
			    printHelper(adj_mat, i, visited);

		}
	}
    
    public int findCircleNum(int[][] adj_mat) {
        int v = adj_mat.length;
		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) {
            //check first vertex of new component of a graph
			if (visited[i] == false) {
                count++;
				printHelper(adj_mat, i, visited);
			}
		}
        return count;
    }
}
