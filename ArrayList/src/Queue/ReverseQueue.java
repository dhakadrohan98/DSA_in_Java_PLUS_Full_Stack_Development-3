package Queue;
import java.util.*;

public class ReverseQueue {
	
	public static void reverseQueue(CircularArrayQueue queue)
	{
		if(queue.isEmpty())
			return;
		
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}

	public static void main(String[] args) {
		// Using CircularArrayQueue
		CircularArrayQueue queue = new CircularArrayQueue();
		
		for(int i=1; i<=6; i++)
			queue.enqueue(i * 10);
		
		reverseQueue(queue);
		
		//print Reverse Queue
		while(!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}

	}

}
