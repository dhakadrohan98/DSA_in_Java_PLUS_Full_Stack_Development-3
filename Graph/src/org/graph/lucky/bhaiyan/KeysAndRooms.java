package org.graph.lucky.bhaiyan;

import java.util.*;

public class KeysAndRooms {
	//TC: O(N^2)
	//SC: O(N)
	 public boolean canVisitAllRooms(List<List<Integer>> rooms) {
	        Queue<Integer> q = new LinkedList<Integer>();
	        boolean[] visited = new boolean[rooms.size()];
	        //Treat given list's indices as vertexes of given graph(all components) & 
	        //child list at i^th index is all vertexes are connected to this i^th vertex.
	        //pick first vertex & put it into queue.
	        int sv = 0;
			q.add(0);
			visited[sv] = true;
			while (!q.isEmpty()) {
				//remove front vertex from queue & 
				//store its associated vertexes i.e. edges into separate a list so one can iterate 
				//over it & mark vertex as visited.
				int front = q.poll();
	            List<Integer> childrens = rooms.get(front);
	            for(int j = 0; j < childrens.size(); j++) {
	                int i = childrens.get(j);
	                if (visited[i] == false) {
						q.add(i);
						visited[i] = true;
					}
	            }
			}
	        
	        for (int i = 1; i < visited.length; i++) {
		            if(visited[i] == false) return false;
		    }
		        
		    return true;
	    }
}
