package Java_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		Queue<Book> queue = new PriorityQueue<Book>();
		
		queue.offer(new Book(121,"Let us C","Yashwant Kanetkar","BPB",8));
		queue.offer(new Book(233,"Operating System","Galvin","Wiley",6));
		queue.offer(new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
		
		for(Book b: queue) {
			System.out.println(b);
		}
		queue.poll();
		System.out.println("After removing 1st times");
		for(Book b: queue) {
			System.out.println(b);
		}
		queue.poll();
		System.out.println("After removing 2nd times");
		for(Book b: queue) {
			System.out.println(b);
		}

	}

}
