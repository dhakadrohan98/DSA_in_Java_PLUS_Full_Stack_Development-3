package Queue;
import java.util.LinkedList;

public class QueueUsingLL {
	
	LinkedList<Integer> queue;
	
	public QueueUsingLL()
	{
		queue = new LinkedList<>();
	}
	
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
	
	public void enqueue(int data)
	{
		queue.addLast(data);
	}
	
	public int dequeue()
	{
		int element = queue.removeFirst();
		return element;
	}
	
	public int getFront()
	{
		return queue.getFirst();
	}

	public static void main(String[] args) {
		
		QueueUsingLL queue = new QueueUsingLL();
		
		for(int i=1; i<=10; i++)
		{
			queue.enqueue(i*10);
		}
		
	    //System.out.println(queue.dequeue());
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.getFront());
			queue.dequeue();
		}

	}

}
