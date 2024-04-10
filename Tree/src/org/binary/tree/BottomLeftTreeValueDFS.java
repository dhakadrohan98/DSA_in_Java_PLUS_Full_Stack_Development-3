package org.binary.tree;

import java.util.*;

//Through DFS approach
//TC: O(n)
//SC = Stack space = O(n)
//Auxiliary space = O(1)
public class BottomLeftTreeValueDFS {
	
	int maxDepth = -1;
    int bottomLeft = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return bottomLeft;
    }
    
    private void dfs(TreeNode root, int currDepth) {
        //base case
        if(root == null) return;
        //main logic
        if(currDepth > maxDepth) {
            maxDepth = currDepth;
            bottomLeft = root.val;
        }
        //recursive calls
        dfs(root.left, currDepth + 1);
        dfs(root.right, currDepth + 1);
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
