package org.binary.tree;

public class MaxDepthOfBinaryTree {

	int depth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        helper(root, 1);
        return depth;
    }
    
    private void helper(TreeNode root, int level) {
        //base case
        if(root == null) {
            return;
        }
        //store max level
        if(root.left == null && root.right == null) {
            depth = Math.max(depth, level);   
        }
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
