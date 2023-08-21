//package com.kumar.tree;
//
//public class BoundaryDSFTreeTraversalResearchTechnique {
//
//
//	int height[n+1];  //n is No. of nodes
//
//
//	void DFS(integer node,G[][],used[],parent[]){
//	    
//		print(node);
//		print("\n");
//	    used[node] = 1 ; 
//	    
//	    for(auto u: G[node]){ //iterating all children "u" of "node"
//	        
//	        if(used[u]==0){
//	            //if this node/branch has never been visited before 
//	            //just go into it and search it using dfs in recursion
//	            parent[u] = node ; 
//	            DFS(u,G,used,parent);
//	            
//	        }
//	    }
//	 }
//
//	Read(n) //No. of nodes
//	G[n+5][]  
//	i = 1 ; 
//	while(i<=n-1){
//	    read(u)
//	    read(v)
//	    G[u].push_back(v);
//	    G[v].push_back(u); 
//	    i++;
//	}
//	    
//	used[n+1]-->0
//	parent[n+1]-->0
//	    
//	DFS(1,G,used,parent); //starts from node 1  
//	       
//	    
//	    return 0 ; 
//  }
