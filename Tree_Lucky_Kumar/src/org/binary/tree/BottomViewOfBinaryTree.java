package org.binary.tree;

import java.util.*;

public class BottomViewOfBinaryTree {

	class Data {
		Node node;
		int hd;

		Data(Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}

	// Function to return a list containing the bottom view of the given tree.
	public ArrayList<Integer> bottomView(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		Queue<Data> queue = new LinkedList<>();

		if (root == null) {
			return ans;
		}

		HashMap<Integer, Data> hm = new HashMap<>();
		int min = 0;
		int max = 0;
		// adding root node with horizontal distance as 0;
		queue.add(new Data(root, 0));

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Data temp = queue.poll();
				hm.put(temp.hd, temp);

				min = Math.min(min, temp.hd);
				max = Math.max(max, temp.hd);

				if (temp.node.left != null) {
					queue.add(new Data(temp.node.left, temp.hd - 1));
				}
				if (temp.node.right != null) {
					queue.add(new Data(temp.node.right, temp.hd + 1));
				}
			}
		}

		// Strogin bottom most nodes from map into ArrayList
		while (min <= max) {
			if (hm.containsKey(min)) {
				ans.add(hm.get(min).node.data);
			}
			min++;
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
