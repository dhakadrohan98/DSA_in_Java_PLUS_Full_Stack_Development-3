package org.leetcode.gfg.aditya.verma;

import java.util.*;

public class OnlineStockSpanGFGSolution {
	//TC: O(N)
	//SC: O(N)
	//Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int nums[], int n)
    {
		// Create a stack and push index of first element
        // to it
        Deque<Integer> st = new ArrayDeque<Integer>();
        int[] res = new int[n];
        // Stack<Integer> st = new Stack<>();
        st.push(0);
 
        // Span value of first element is always 1
        res[0] = 1;
 
        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
 
            // Pop elements from stack while stack is not
            // empty and top of stack is smaller than
            // price[i]
            while (!st.isEmpty()
                   && nums[st.peek()] <= nums[i])
                st.pop();
 
            // If stack becomes empty, then price[i] is
            // greater than all elements on left of it,
            // i.e., price[0], price[1], ..price[i-1]. Else
            // price[i] is greater than elements after top
            // of stack
            res[i] = (st.isEmpty()) ? (i + 1)
                                  : (i - st.peek());
 
            // Push this element to stack
            st.push(i);
        }
        return res;
    }
}
