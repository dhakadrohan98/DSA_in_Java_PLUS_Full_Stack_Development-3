package org.binary.tree;

import java.util.*;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        //base case
        if(root == null) {
            return result;
        }
        
        String current_path = Integer.toString(root.val);
        
        //edge case -> if root is a leaf node
         if(root.left == null & root.right == null) {
             result.add(current_path);
        }
        
        if(root.left != null) {
            dfs(root.left, current_path, result);
        }
        if(root.right != null) {
            dfs(root.right, current_path, result);
        }
        
        return result;
    }
    
    private void dfs(TreeNode node, String current_path, List<String> result) {
        current_path = current_path + "->" + node.val;
        
        //base case -> if given node is a leaf node
         if(node.left == null & node.right == null) {
             result.add(current_path);
             return;
        }
        
        if(node.left != null) {
            dfs(node.left, current_path, result);
        }
        if(node.right != null) {
            dfs(node.right, current_path, result);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
