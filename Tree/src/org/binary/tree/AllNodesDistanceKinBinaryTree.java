package org.binary.tree;

import java.util.*;

//Key Notes:
//
//- Mark each node to its parent to traverse upwards.
//- We will do a BFS traversal starting from the target node
//- As long as we have not seen our node previously, Traverse up, left, right until reached Kth distance
//- When reached Kth distance, break out of BFS loop and remaining node's values in our queue is our result.
public class AllNodesDistanceKinBinaryTree {
	private void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track, TreeNode target) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			if (current.left != null) {
				parent_track.put(current.left, current);
				queue.offer(current.left);
			}
			if (current.right != null) {
				parent_track.put(current.right, current);
				queue.offer(current.right);
			}
		}
	}

	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		Map<TreeNode, TreeNode> parent_track = new HashMap<>();
		markParents(root, parent_track, root);
		Map<TreeNode, Boolean> visited = new HashMap<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(target);
		visited.put(target, true);
		int distance = 0;
		while (!queue.isEmpty()) {
			// second BFS to go upto K level from target node and using our hahsTable info.
			int size = queue.size();
			//remaining nodes into queue will be our nodes at a distance k from target node.
			if (distance == k) {
				break;
			}
			distance++;
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.poll();
				if (current.left != null && visited.get(current.left) == null) {
					queue.offer(current.left);
					visited.put(current.left, true);
				}
				if (current.right != null && visited.get(current.right) == null) {
					queue.offer(current.right);
					visited.put(current.right, true);
				}
				TreeNode parentOfCurrNode = parent_track.get(current);
				if (parentOfCurrNode != null && visited.get(parentOfCurrNode) == null) {
					queue.offer(parentOfCurrNode);
					visited.put(parentOfCurrNode, true);
				}

			}
		}

		// store nodes from queue to ArrayList<Integer>
		List<Integer> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			result.add(current.val);
		}
		return result;
	}
}
