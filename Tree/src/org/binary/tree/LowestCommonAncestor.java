package org.binary.tree;

public class LowestCommonAncestor {

    // TC: O(N)
    // SC: O(N) ( stack space in case of worst case i.e. skew tree)

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        //result
        if(left == null) {
            return right; //if right is also null it doesn't matter
        }
        else if(right == null) {
            return left; //if left is also null it doesn't matter
        }
        else { //both left & right are not null, it means both are under current node 
            return root;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
