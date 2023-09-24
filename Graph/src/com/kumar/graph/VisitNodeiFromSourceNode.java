package com.kumar.graph;
import java.util.*;

public class VisitNodeiFromSourceNode {

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
		
		while(!q.isEmpty()) {
			//BFS algo
			
			int v = q.remove();
			System.out.println("Node: "+v+" "+"level[v]: "+level[v]);
			//Iterating through adjacent nodes of v
			for(int i=0; i< G.get(v).size(); i++) {
				
				int u = G.get(v).get(i);
				
				if(visited[u] == 0) {
					q.add(u);
					visited[u] = 1;
					level[u] = level[v] + 1;
				}
			}
		}
		
		//
		for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                System.out.println("You cannot visit the node " + i + " from the source node = " + source);
            } else {
                System.out.println("You can visit the node " + i + " from the source node = " + source);
            }
        }
	
	}
}

//Input::
//Enter the number of nodes/vertices: 
//9
//Enter the number of edges
//6
//1 3
//1 2
//2 5
//3 4
//6 7
//7 8

//Output::
//You can visit the node 1 from the source node = 1
//You can visit the node 2 from the source node = 1
//You can visit the node 3 from the source node = 1
//You can visit the node 4 from the source node = 1
//You can visit the node 5 from the source node = 1
//You cannot visit the node 6 from the source node = 1
//You cannot visit the node 7 from the source node = 1
//You cannot visit the node 8 from the source node = 1
//You cannot visit the node 9 from the source node = 1
