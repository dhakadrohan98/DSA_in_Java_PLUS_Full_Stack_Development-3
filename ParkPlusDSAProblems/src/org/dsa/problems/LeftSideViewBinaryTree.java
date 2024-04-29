package org.dsa.problems;

import java.util.*;

public class LeftSideViewBinaryTree {
	//TC: O(n)
    //SC: O(n)
    public List<Integer> rightSideView(TreeNode root) {
        //edge cases
        if(root == null) {
            return new ArrayList<>();
        }
        
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            //level started
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); 
                list.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            //level ended up
            ans.add(list.get(0));
            
        }
        return ans;
    }
}
