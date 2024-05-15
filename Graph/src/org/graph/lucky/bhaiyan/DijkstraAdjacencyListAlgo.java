package org.graph.lucky.bhaiyan;

import java.util.*;

public class DijkstraAdjacencyListAlgo {
	public static class Pair implements Comparable<Pair> {
		int vertex;
		int acquiringVertex;
		int weight;

		public Pair(int vertex, int acquiringVertex, int weight) {
			super();
			this.vertex = vertex;
			this.acquiringVertex = acquiringVertex;
			this.weight = weight;
		}

		// sort the object on the basis of weight
		@Override
		public int compareTo(Pair o) {
			return this.weight - o.weight;
		}
	}
	
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int srcV) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		int[] path = new int[V];
		//add srcV with 0 as acquiringVertex & 0 as weight
		pq.offer(new Pair(srcV, 0, 0));
		boolean[] visited = new boolean[V];
		
		while(pq.size() > 0) {
			Pair removed = pq.poll();
			//if removed vertex is already visited then skip below lines of code & move on to the next iteration
			if(visited[removed.vertex] == true) continue;
			//mark removed vertex as visited
			visited[removed.vertex] = true;
			//store weight(dist) in path array
			path[removed.vertex] = removed.weight;
			//iterate through adjacent vertexes(not visited) of curr removed vertex & push them into queue again
			//with its vertex, parent vertex, updated weight.
			for(ArrayList<Integer> list : adj.get(removed.vertex)) {
				if(visited[list.get(0)] == false) {
					pq.add(new Pair(list.get(0), removed.vertex, list.get(1)+removed.weight));
				}
			}
		}
		return path;
	}
}
