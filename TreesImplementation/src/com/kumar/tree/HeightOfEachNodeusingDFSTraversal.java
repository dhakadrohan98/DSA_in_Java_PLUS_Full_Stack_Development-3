package com.kumar.tree;
import java.util.*;

public class HeightOfEachNodeusingDFSTraversal {

	static long[] height;
	 
    public static void DFS(int node, List<Integer>[] G, int[] used, int[] parent) {
        used[node] = 1;
 
        for (int u : G[node]) {
            if (used[u] == 0) {
                parent[u] = node;
                DFS(u, G, used, parent);
            }
        }
 
        long h = 0;
        for (int child : G[node]) {
            if (child == parent[node]) {
                continue;
            } else {
                h = Math.max(h, height[child]);
            }
        }
 
        height[node] = 1 + h;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = scanner.nextInt();
        height = new long[n + 1];
        List<Integer>[] G = new List[n + 1];
 
        for (int i = 0; i <= n; i++) {
            G[i] = new ArrayList<>();
        }
 
        for (int i = 1; i <= n - 1; i++) {
        	System.out.println("Enter vale of x of "+i+" pair");
            int u = scanner.nextInt();
            System.out.println("Enter vale of y of "+i+" pair");
            int v = scanner.nextInt();
            G[u].add(v);
            G[v].add(u);
        }
 
        int[] used = new int[n + 1];
        int[] parent = new int[n + 1];
        DFS(1, G, used, parent); // starts from node 1
 
        for (int i = 1; i <= n; i++) {
            System.out.println(height[i]);
        }
    }

}
