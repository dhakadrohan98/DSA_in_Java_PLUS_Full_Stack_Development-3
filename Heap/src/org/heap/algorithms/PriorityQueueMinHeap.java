package org.heap.algorithms;

import java.util.PriorityQueue;
//Min heap by default
public class PriorityQueueMinHeap {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.offer(10);
		queue.offer(15);
		queue.offer(8);
		queue.offer(19);
		System.out.println(queue);
		Integer poll = queue.poll();
		System.out.println(poll);
		System.out.println("After removing element");
		System.out.println(queue);
		
	}
}
