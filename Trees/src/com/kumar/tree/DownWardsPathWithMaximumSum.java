package com.kumar.tree;
import java.util.*;

//sum[i] = value[i] + sum(sum[c1] + sum[c2] + sum[c3] +...................+ sum[ck])
//where c1,c2,.......,ck ->  children of Node i
public class DownWardsPathWithMaximumSum {
	static long[] sum;
	static int[] value;
        	 
    public static void DFS(int node, List<Integer>[] G, int[] used, int[] parent) {
        used[node] = 1;
 
        for (int u : G[node]) {
            if (used[u] == 0) {
                parent[u] = node;
                DFS(u, G, used, parent);
            }
        }
        
        System.out.println("current node in proccessing: "+node);
 
        long s = 0;
        for (int child : G[node]) {
            if (child == parent[node]) {
                continue;
            } else {
                s = Math.max(sum[child], s);
            }
        }
 
        sum[node] = value[node] + s;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = scanner.nextInt();
        sum = new long[n+1];
        value = new int[n+1];
        
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
        
        System.out.println("Enter values of each node one by one");
        //Read values of []value array for each node
        int j=1;
        
        while(j <= n) {
        	value[j] = scanner.nextInt();
        	j++;
        }
 
        int[] used = new int[n + 1];
        int[] parent = new int[n + 1];
        DFS(1, G, used, parent); // starts from node 1
 
        long answer = -100000000000000L;
     
        for(int i=1; i<=n; i++) {
        	answer = Math.max(answer, sum[i]);
        }
        
        System.out.println("Maximum downwards path : " + answer);
    }
}

//for (int i = 1; i <= n; i++) {
//  System.out.println("sum of "+ i + " node is-> "+sum[i]);
//  answer = (int) Math.max(answer, sum[i]);
//}
