/*
 * package com.kumar.tree; -> n -> G[][]
 * 
 * 
 * i = 1 ; while(i<=n-1){ read(x) read(y) G[x].push_back(y) G[y].push_back(x)
 * i=i+1 }
 * 
 * 
 * queue <int> q used[n+1]-->0 used[1] = 1 q.push(1) child[n+1]-->[0]
 * 
 * child[i]---> number of children of node i
 * 
 * while(!q.empty()){
 * 
 * top = q.front() count = 0 q.pop() print(top) for(auto children : G[top]){
 * 
 * 
 * if(used[children]==0){ //children is //node which directly connected to top
 * node // used[children]==0 means it has never been reached before.
 * used[children] = 1 q.push(children) count = count + 1
 * 
 * 
 * 
 * } else{ //parent..... } child[top] = count
 * 
 * }
 * 
 * }
 * 
 * 
 * i=1 while(i<=n){
 * 
 * print(child[i])
 * 
 * i++; }
 * 
 * --->prinitng leaves. i = 1 while(i<=n){
 * 
 * if(child[i]==0){ print(i) } }
 */