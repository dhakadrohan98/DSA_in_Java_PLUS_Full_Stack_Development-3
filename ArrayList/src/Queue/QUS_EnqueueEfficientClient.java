package Queue;

public class QUS_EnqueueEfficientClient {

	public static void main(String[] args) throws Exception {
		
		QUS_EnqueueEfficient queue = new QUS_EnqueueEfficient();
		
		for(int i=1; i<=5; i++)
		{
			queue.enqueue(i*10);
		}
		
		queue.display();
		
		System.out.println(queue.dequeue());
		
		queue.display();
		
		System.out.println(queue.front()); //20
		queue.display(); // 20,30,40,50
		

	}

}
