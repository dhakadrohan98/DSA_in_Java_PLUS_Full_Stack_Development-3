package com.kumar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Google Interview Problem.-> Given a Tree of ‘N’ Nodes and ‘N-1’ Edges; rooted at 1 ; 
//each node is assigned either 1 or 0 ; for each node “i” ; 
//find the number of 1’s on the shortest path from node 1 to node “i”

public class GoogleProblemOnTrees {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter no. of nodes");
        int n = scanner.nextInt();
        
        //Creating list of lists to hold children nodes of a particular parent node
        ArrayList<Integer>[] G = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            G[i] = new ArrayList<>();
            System.out.println(G[i]);
        }
        
 
        int i = 1;
        while (i <= n - 1) {
        	System.out.println("Enter "+i+"th value of x");
            int x = scanner.nextInt();
            System.out.println("Enter "+i+"th value of y");
            int y = scanner.nextInt();
            G[x].add(y);
            G[y].add(x);
            i++;
        }
        
        //Reading values of each node in a separate array b[n];
        int[] b = new int[n+1];
        int j=1;
        Scanner sc = new Scanner(System.in);
        while(j<=n) {
        	System.out.println("Enter node "+j+"th node value");
        	b[j] = sc.nextInt();
        	j++;
        }
 
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[n + 1];
        used[1] = 1;
        q.offer(1);
        int[] ans = new int[n+1];
        
        ans[1] = b[1];
 
        while (!q.isEmpty()) {
            int top = q.poll();
            int count = 0;
            
            for (int childern : G[top]) {
            	
                if (used[childern] == 0) {
                	count++;
                    used[childern] = 1;
                    q.offer(childern);
                    
                    if(b[childern] == 1) {
                    	ans[childern] = ans[top] + 1;
                    }
                    else {
                    	ans[childern] = ans[top];
                    }
                }
                
                else {
                	//parent.....
                }
           }
        }
        
        i=1;
        while(i<=n) {
        	
        	System.out.println(ans[i]);
        	i++;
        }
}
}
