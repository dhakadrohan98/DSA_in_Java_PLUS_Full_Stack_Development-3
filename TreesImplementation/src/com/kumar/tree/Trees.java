package com.kumar.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Trees {

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
		        
		        System.out.println("printing values of G[] list below");
		        for(int j=1; j<=n; j++) {
		        	System.out.println(G[j]);
		        }
		 
		        Queue<Integer> q = new LinkedList<>();
		        int[] used = new int[n + 1];
		        used[1] = 1;
		        q.offer(1);
		        int[] child = new int[n+1];
		 
		        while (!q.isEmpty()) {
		            int top = q.poll();
		            int count = 0;
		            for (int childern : G[top]) {
		                if (used[childern] == 0) {
		                	count++;
		                    used[childern] = 1;
		                    q.offer(childern);
		                }
		                
		                else {
		                	//parent.....
		                }
		                
		                child[top] = count;
		                
		            }
		 
		            System.out.println("Parent:"+top + " :: Childern:" + count);
		        }
		        
		        i=1;
		        while(i<=n) {
		        	if(child[i] == 0) {
		        		System.out.println("Leaf node: "+i);
		        	}
		        	
		        	i++;
		        }
		}
}
