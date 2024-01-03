package Java_collections;

import java.util.*;

public class QueuePriority {

	public static void main(String[] args) {
		//comparator is passed in priorityQueue class for reverse ordering of elements in PriorityQueue.
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		System.out.println(pq);
		int element = pq.peek();
		System.out.println(element);
		System.out.println(pq);

	}

}
