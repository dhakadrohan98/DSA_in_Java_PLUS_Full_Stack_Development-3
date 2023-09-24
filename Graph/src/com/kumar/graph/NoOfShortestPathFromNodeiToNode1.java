package com.kumar.graph;
import java.util.*;

public class NoOfShortestPathFromNodeiToNode1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes/vertices: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of edges");
		int m = sc.nextInt();
		
		List<List<Integer>> G = new ArrayList<>();
		
		//creating number of vertices in a Graph
		for(int i=0; i<=n; i++) {
			G.add(new ArrayList<Integer>());
		}
		
		//Reading edges of the Graph.
		for(int i=1; i<=m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			G.get(u).add(v);
			G.get(v).add(u);
			//undirected graph
		}
		
		int source = 1;
		Queue<Integer> q = new LinkedList<>();
		q.add(1); //adding source node
		
		int[] visited = new int[n+1];
		visited[1] = 1;
		
		int[] level = new int[n+1];
		level[1] = 0;
		
		//storing number of ways for node i in an array
		int[] ways = new int[n+1];
		ways[1] = 1;
		
		while(!q.isEmpty()) {
			//BFS algo
			
			int v = q.remove();
			System.out.println("Node: "+v+" "+"ways[v]: "+ways[v]);
			//Iterating through adjacent nodes of v
			for(int i=0; i< G.get(v).size(); i++) {
				
				int u = G.get(v).get(i);
				
				if(visited[u] == 0) {
					q.add(u);
					visited[u] = 1;
					level[u] = level[v] + 1;
					//ways
					ways[u] = ways[v];
				}
				else {
					if(level[v]+1 == level[u]) {
						//if node u is on the shortest path
						ways[u] = ways[u] + ways[v];
					}
				}
			}
		}
		
	}
}

//Input::
//Enter the number of nodes/vertices: 
//10
//Enter the number of edges
//10
//1 2
//2 3
//3 5
//1 6
//6 7
//7 5
//1 8
//8 9
//9 10
//10 5

//Output:
//Node: 1 ways[v]: 1
//Node: 2 ways[v]: 1
//Node: 6 ways[v]: 1
//Node: 8 ways[v]: 1
//Node: 3 ways[v]: 1
//Node: 7 ways[v]: 1
//Node: 9 ways[v]: 1
//Node: 5 ways[v]: 2
//Node: 10 ways[v]: 1
