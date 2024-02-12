package org.coding.arr;

public class CircularArray {
	
	private int[] arr;
	private int front = -1;
	private int rear = -1;
	private int size;
	private int capacity;

	public CircularArray(int capacity) {
		super();
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
            return;
		}
		
		if(isEmpty()) {
			front = rear = 0;
		} else {
			rear = (rear+1) % capacity;
		}
		arr[rear] = element;
		size++;
	}

	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue");
			return -1;
		}
		
		int removedElement = arr[front];
		
		if(front == rear) { // front == rear means queue has only one element.
			front = rear = -1; //queue became empty here.
		} else {
			front = (front+1) % capacity;
		}
		size--;
		return removedElement;
	}
	
	public int front() {
		if(isEmpty()) {
			 System.out.println("Queue is empty.");
	         return -1; // Return an invalid value or throw an exception
		}
		return arr[front];
	}
	
	public int size() {
        return size;
    }
	
	public void printCircularQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.print("Circular queue: ");
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		CircularArray cq = new CircularArray(5);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		System.out.println(cq.front());
		cq.printCircularQueue();
	}
}
