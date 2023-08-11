package Java_collections;
import java.util.*;

public class QueueThroughLL {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList(); 
		
		queue.offer(40);
		queue.offer(50);
		queue.offer(60);
		queue.offer(70);
		queue.offer(80);
		
		System.out.println(queue.element());
		queue.poll();

	}

}
