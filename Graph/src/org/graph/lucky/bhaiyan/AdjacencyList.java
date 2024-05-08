package org.graph.lucky.bhaiyan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyList {
	//TC: O(v+2e)
	//SC: O(v^2)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertexes");
		int v = sc.nextInt();
		System.out.println("Enter no. of edges");
		int e = sc.nextInt();
		ArrayList<Integer>[] adj_list = new ArrayList[v];
		//careating ArrayList<Integer> & assigning to each index of array *(adj_list)*
		//TC: O(v)
		for(int i = 0; i < v; i++) {
			adj_list[i] = new ArrayList<Integer>();
		}
		
		System.out.println("Enter comma edges as pair & new line separated: ");
		for(int i = 0; i < e; i++) {
			int sv = sc.nextInt();
			int ev = sc.nextInt();
			adj_list[sv].add(ev);
			adj_list[ev].add(sv);
		}
		
		System.out.println("Ajacency list");
		for(ArrayList<Integer> temp: adj_list) {
			System.out.println(temp);
		}
	}
}
