package org.binary.tree;

import java.util.*;

public class VerticalOrderTraversal {
	//TC: O(n * log2n)
	//SC: O(n) + O(n)
	class Tuple {
	    TreeNode node;
	    //vertical
	    int row;
	    //levels
	    int col;
	    public Tuple(TreeNode _node, int _row, int _col) {
	        node = _node;
	        row = _row;
	        col = _col;
	    }
	}
	
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
		Queue<Tuple> q = new LinkedList<Tuple>();
		q.offer(new Tuple(root, 0, 0));
		while (!q.isEmpty()) {
			Tuple tuple = q.poll();
			TreeNode node = tuple.node;
			int x = tuple.row; //vertical
			int y = tuple.col; //level

			if (!map.containsKey(x)) { //check for vertical
				map.put(x, new TreeMap<>());
			}
			if (!map.get(x).containsKey(y)) { //checking for multiple levels
				map.get(x).put(y, new PriorityQueue<>());
			}
			map.get(x).get(y).offer(node.val); //keeping nodes of a vertical & a level at a time

			if (node.left != null) {
				q.offer(new Tuple(node.left, x - 1, y + 1)); //going left downward->(-1, +1)
			}
			if (node.right != null) {
				q.offer(new Tuple(node.right, x + 1, y + 1));//going right downward->(+1, +1)
			}
		}
		List<List<Integer>> list = new ArrayList<>();
		for (TreeMap<Integer, PriorityQueue<Integer>> tp : map.values()) { //iterating through <levels> of each vertical
			list.add(new ArrayList<>());
			for (PriorityQueue<Integer> nodes : tp.values()) { //iterating through all nodes of all levels of each vertical
				while (!nodes.isEmpty()) {
					list.get(list.size() - 1).add(nodes.poll());
				}
			}
		}
		return list;

	}
}
