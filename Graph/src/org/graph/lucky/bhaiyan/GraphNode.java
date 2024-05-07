package org.graph.lucky.bhaiyan;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	
	public int val;
	public List<GraphNode> edges;
	
	public GraphNode(int val) {
		this.val = val;
	}
	
	public void addEdges(GraphNode vertex) {
		if(this.edges == null) {
			this.edges = new ArrayList<>();
		}
		this.edges.add(vertex);
	}
	
	public static void printEdges(GraphNode vertex) {
		if(vertex.edges != null) {
			for(GraphNode temp : vertex.edges) {
				System.out.print(temp.val + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("This vertex doesn't have any edge");
		}
	}
}
