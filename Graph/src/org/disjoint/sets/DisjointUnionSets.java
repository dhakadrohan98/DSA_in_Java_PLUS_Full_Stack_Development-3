package org.disjoint.sets;

//union() & find() operation
//union by rank
//path compression
public class DisjointUnionSets {

	int[] parent, rank;
	public int n;

	public DisjointUnionSets(int n) {
		parent = new int[n];
		rank = new int[n];
		this.n = n;
		// Initializing parent array with its indexes values at the very starting
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}
	
	//for Path compression, make some changes in find() method
	int find(int x) {
		if (parent[x] != x) {
			//recursive call
			parent[x] = find(parent[x]);
		}
		// recursive call
		return parent[x];
	}

	void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);

		if (xRoot == yRoot) {
			return;
		}

		if (rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
		} else if (rank[yRoot] < rank[xRoot]) {
			parent[yRoot] = xRoot;
		} else {
			parent[yRoot] = xRoot;
			rank[xRoot] = rank[xRoot] + 1;
		}
	}
}
