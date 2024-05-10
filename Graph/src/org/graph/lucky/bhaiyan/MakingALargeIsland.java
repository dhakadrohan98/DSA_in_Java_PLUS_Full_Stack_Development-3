package org.graph.lucky.bhaiyan;

import java.util.*;

public class MakingALargeIsland {
	// TC: O(N*N*4*4*alpha)
	// SC: O(N*N)
	class DisjointSet {
		List<Integer> rank = new ArrayList<>();
		List<Integer> parent = new ArrayList<>();
		List<Integer> size = new ArrayList<>();

		public DisjointSet(int n) {
			for (int i = 0; i <= n; i++) {
				rank.add(0);
				parent.add(i);
				size.add(1);
			}
		}

		public int findUPar(int node) {
			if (node == parent.get(node)) {
				return node;
			}
			int ulp = findUPar(parent.get(node));
			parent.set(node, ulp);
			return parent.get(node);
		}

		public void unionByRank(int u, int v) {
			int ulp_u = findUPar(u);
			int ulp_v = findUPar(v);
			if (ulp_u == ulp_v)
				return;
			if (rank.get(ulp_u) < rank.get(ulp_v)) {
				parent.set(ulp_u, ulp_v);
			} else if (rank.get(ulp_v) < rank.get(ulp_u)) {
				parent.set(ulp_v, ulp_u);
			} else {
				parent.set(ulp_v, ulp_u);
				int rankU = rank.get(ulp_u);
				rank.set(ulp_u, rankU + 1);
			}
		}

		public void unionBySize(int u, int v) {
			int ulp_u = findUPar(u);
			int ulp_v = findUPar(v);
			if (ulp_u == ulp_v)
				return;
			if (size.get(ulp_u) < size.get(ulp_v)) {
				parent.set(ulp_u, ulp_v);
				size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
			} else {
				parent.set(ulp_v, ulp_u);
				size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
			}
		}
	}

	private boolean isValid(int newr, int newc, int n) {
		return newr >= 0 && newr < n && newc >= 0 && newc < n;
	}

	// driver code
	public int largestIsland(int grid[][]) {
		int n = grid.length;
		DisjointSet ds = new DisjointSet(n * n);
		// step - 1
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (grid[row][col] == 0)
					continue;
				int dr[] = { -1, 0, 1, 0 };
				int dc[] = { 0, -1, 0, 1 };
				// visit into four directions to apply union on two cells of grid having 1.
				for (int ind = 0; ind < 4; ind++) {
					int newr = row + dr[ind];
					int newc = col + dc[ind];
					if (isValid(newr, newc, n) && grid[newr][newc] == 1) {
						int nodeNo = row * n + col;
						int adjNodeNo = newr * n + newc;
						ds.unionBySize(nodeNo, adjNodeNo);
					}
				}
			}
		}
		// step 2
		int mx = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (grid[row][col] == 1)
					continue;
				int dr[] = { -1, 0, 1, 0 };
				int dc[] = { 0, -1, 0, 1 };
				HashSet<Integer> components = new HashSet<>();
				// set to store parent nodes of connected cell because two same ultimate
				// parent can be found from cells of same component.
				for (int ind = 0; ind < 4; ind++) {
					int newr = row + dr[ind];
					int newc = col + dc[ind];
					if (isValid(newr, newc, n)) {
						if (grid[newr][newc] == 1) {
							components.add(ds.findUPar(newr * n + newc));
						}
					}
				}
				int sizeTotal = 0;
				for (Integer parents : components) {
					sizeTotal += ds.size.get(parents);
				}
				// sizeTotal + 1(due to converting 0 into 1 to make it conncented)
				mx = Math.max(mx, sizeTotal + 1);
			}
		}
		// Step3
		// But if the matrix does not contain any cell with 0, step 2 will not be
		// executed. For that reason, we will just run a loop from node number 0 to n*n
		// and for each node number, we will find the ultimate parent. After that, we
		// will find the sizes of those ultimate parents and will take the size of the
		// largest one.
		for (int cellNo = 0; cellNo < n * n; cellNo++) {
			mx = Math.max(mx, ds.size.get(ds.findUPar(cellNo)));
		}
		return mx;
	}
}
