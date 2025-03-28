package org.leetcode.easy.revision;

import java.util.*;
public class ArrayLeaders {
	
	 //TC: O(n)
    //SC: O(n)
    public static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] >= st.peek()) {
                st.push(arr[i]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()) {
            list.add(st.pop());
        }
        return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
