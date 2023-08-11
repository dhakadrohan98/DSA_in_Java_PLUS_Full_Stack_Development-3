package Queue;

public class QUS_DequeueEfficientClient {

	public static void main(String[] args) throws Exception {
		
		QUS_DequeueEfficient queue = new QUS_DequeueEfficient();
		
		for(int i=1; i<=5; i++)
		{
			queue.enqueue(i*10);
		}
		
		queue.display();
		
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front());

	}

}
