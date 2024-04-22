package org.binary.search.tree;

public class TrimABinarySearchTree {
	//TC: O(N)
	//SC: O(N) stack space
    public TreeNode trimBST(TreeNode root, int low, int high) {
        //base case
        if(root == null) return root;
        
        if(root.val < low) {
            return trimBST(root.right, low, high);
        } else if(root.val > high) {
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
