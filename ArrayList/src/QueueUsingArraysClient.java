public class QueueUsingArraysClient {

	public static void main(String[] args) {
		QueueUsingArrays queue = new QueueUsingArrays();
		
		//Deleting an element
		queue.deQueue();
		
		//Inserting element
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		queue.enQueue(60);
		
		queue.display();
		queue.deQueue();
		
		queue.display();
		queue.deQueue();
		
		queue.display();
		queue.deQueue();
		
		queue.display();
		queue.deQueue();
		
		queue.display();
		queue.deQueue();
		
		System.out.println("Front index: " + queue.front);
		System.out.println("Rear index: " + queue.rear);

	}

}
