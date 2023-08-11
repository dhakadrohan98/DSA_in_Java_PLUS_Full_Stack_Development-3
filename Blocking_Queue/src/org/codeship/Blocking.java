package org.codeship;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	
	private ArrayBlockingQueue<Integer> queue;
 
	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
 
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(5000);
				queue.put(Blocking.counter++);
				System.out.println("Value added in the queue: "+Blocking.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
 
public class Blocking {
	static int counter = 0;
 
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer produce = new Producer(queue);
		Thread producerThread = new Thread(produce);
        producerThread.start();
        
        
	}
 
}