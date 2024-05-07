package org.graph.lucky.bhaiyan;

public class GraphDemo {

	public static void main(String[] args) {
		GraphNode vertexA = new GraphNode(0);
		GraphNode vertexB = new GraphNode(1);
		GraphNode vertexC = new GraphNode(2);
		GraphNode vertexD = new GraphNode(3);
		GraphNode vertexE = new GraphNode(5);
		
		vertexA.addEdges(vertexB);
		vertexB.addEdges(vertexC);
		vertexB.addEdges(vertexD);
		vertexC.addEdges(vertexD);
		vertexD.addEdges(vertexE);
		
		vertexA.printEdges(vertexE);
		
		

	}

}
