package com.kumar.tree;
/*
 * package com.kumar.tree; -> n -> G[][]
 * 
 * 
 * i = 1 ; while(i<=n-1){ read(x) read(y) G[x].push_back(y) G[y].push_back(x)
 * i=i+1 }
 * 
 * j = 1 int[] b = new int[n]; while(j<=n) { int b[j] = new
 * Scanner(System.in).nextInt(); i++; }
 * 
 * 
 * queue <int> q used[n+1]-->0 used[1] = 1 q.push(1) answer[n+1]-->[0]
 * 
 * answer[i]---> number of 1s from node 1 to node i
 * 
 * answer[1] = b[1]
 * 
 * 
 * 
 * while(!q.empty()){
 * 
 * parent = q.front() count = 0 q.pop() print(parent) for(auto children :
 * G[parent]){
 * 
 * 
 * if(used[children]==0){ //children is //node which directly connected to top
 * node // used[children]==0 means it has never been reached before.
 * used[children] = 1 q.push(children) count = count + 1
 * 
 * if(b[children]==1) { answer[children] = answer[parent] + 1; } else { //value
 * of answer[children] will remain same. answer[children] = answer[parent]; }
 * 
 * 
 * } else{ //parent..... } }
 * 
 * }
 * 
 * 
 * i=1 while(i<=n){
 * 
 * print(answer[i])
 * 
 * i++; }
 */