package org.heap.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;

//Max heap through reversing natural ordering of collections(PriorityQueue)
public class PriorityQueueMaxHeap {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.offer(10);
		queue.offer(15);
		queue.offer(8);
		queue.offer(19);
		System.out.println(queue);
		Integer poll = queue.poll();
		System.out.println(poll);
		System.out.println("After removing element");
		System.out.println("Head of the queue: " + queue.peek());
	}
}
