package org.binary.tree;

public class InvertBinaryTree {
	//TC: O(n)
	//SC = stack space: O(n)
	public TreeNode invertTree(TreeNode root) {
        //base case
        if(root == null) return root;
        dfs(root);
        return root;
    }
    
    private void dfs(TreeNode root) {
        //base case
        if(root == null) return;
        
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        dfs(root.left);
        dfs(root.right);
    }
    
    public static void main(String[] args) {
		
	}
}
