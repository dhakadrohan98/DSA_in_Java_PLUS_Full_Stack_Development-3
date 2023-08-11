package com.collection.framework;
import java.util.*;

public class LinkedListQueueInterface {

	public static void main(String[] args) {
		Queue<Integer> ll = new LinkedList<Integer>();
		
		ll.offer(99);
		ll.offer(88);
		ll.offer(87);
		ll.offer(79);
		ll.offer(97);
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);

	}

}
