package com.kumar.graph;

import java.util.*;
 
public class DepthFirstSearch {
    public static void DFS(int node, List<Integer>[] G, List<Integer> visited, List<Integer> parent) {
        System.out.println(node);
        visited.set(node, 1);
 
        for (int u : G[node]) {
            if (visited.get(u) == 0) {
                parent.set(u, node);  //setting parent of u as value of node
                DFS(u, G, visited, parent);
            }
        }
    }
    
    //How to perform DFS in disconnected component of a graph.
    public static int numProvinces(int node, List<Integer>[] G, List<Integer> visited, int numOfNodes, 
    								List<Integer> parent) {
    	int provinces = 0;
    	
    	for(int nodee=1; nodee <numOfNodes; nodee++) {
    		if(visited.get(nodee) == 0) {
    			provinces++;
//    			System.out.println("provinces: "+provinces);
    			DFS(nodee, G,visited,parent);
    		}
    	}
    	return provinces;
    }
    
    //count number of provinces through BFS (BFS uses Queue DS internally).
    public static int BFS(List<Integer>[] G, List<Integer> visited, int numOfNodes) 
    {
    	int provincess = 0;
    	Queue<Integer> queue = new LinkedList<Integer>();
    	//Iterating through all nodes of a graph
    	for(int node=0; node<numOfNodes; node++) {
    		if(visited.get(node) == 0) {
    			provincess++;
    			queue.offer(node);
    			visited.set(node, 1);
    			
    			while(queue.isEmpty()) {
    				int front = queue.poll();
    				System.out.println(front);
    				//iterating through all adjacent node of particular node
    				for(int child:G[front]) {
    					queue.offer(child);
    					visited.set(child, 1);
    				}
    			}
    		}
    	}		
    	return provincess;
    }
  
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter number of nodes of a graph:");
        int n = scanner.nextInt();
        System.out.println("Enter number of edges of a graph:");
        int m = scanner.nextInt();
        List<Integer>[] G = new List[n + 5]; //Array of List<Integer>; size=(n+5);
//        List<Integer>[] G = new List[n]; //Array of List<Integer>; size=(n+5);
        for (int i = 0; i < n + 5; i++) {
            G[i] = new ArrayList<>();
        }
        
//        for (int i = 0; i < n; i++) {
//            G[i] = new ArrayList<>();
//        }
 
        int i = 1;
        while (i <= m) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            G[u].add(v);
            G[v].add(u);
            i++;
        }

//      int i = 0;
//      while (i < m) {
//          int u = scanner.nextInt();
//          int v = scanner.nextInt();
//          G[u].add(v);
//          G[v].add(u);
//          i++;
//      }
        
 
        List<Integer> visited = new ArrayList<>(n + 5);
        List<Integer> parent = new ArrayList<>(n + 5);
        for (int j = 0; j < n + 5; j++) {
            visited.add(0);
            parent.add(0);
        }
        //calling dfs function in recursive way
//        DFS(1, G, visited, parent);
        int province = numProvinces(1,G,visited,n,parent);
        System.out.println("Final provinces: "+province);
        
//        int province = BFS(G,visited,n);
//        System.out.println(province);
    }
}

//Input:
//Enter number of nodes of a graph:
//8
//Enter number of edges of a graph:
//7
//1 2
//1 3
//2 4 
//2 5 
//3 6 
//3 7 
//5 8

//Output:
//1
//2
//4
//5
//8
//3
//6
//7

//Input-2:
//Enter number of nodes of a graph:
//9
//Enter number of edges of a graph:
//6

//0 2
//0 3
//2 3
//4 5
//6 7
//6 8

//1 2
//1 3
//3 4
//5 6
//7 8
//9 8
