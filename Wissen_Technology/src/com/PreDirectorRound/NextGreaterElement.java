package com.PreDirectorRound;

import java.util.Stack;

public class NextGreaterElement {
	public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st = new Stack<>();
        long[] ans = new long[n];
        
        ans[n-1] = -1;
        st.push(arr[n-1]);
        
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < st.peek()) {
                ans[i] = st.peek();
            }
            else {
                while(st.size() > 0) {
                    st.pop();
                    if(st.size() == 0) {
                        ans[i] = -1;
                        break;
                    }
                    if(arr[i] < st.peek()) {
                        ans[i] = st.peek();
                        break;
                    }
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
