package Queue;

public class CircularArrayQueue {
	
	private int[] arr;
	private int cs;
	private int ms;
	private int front;
	private int rear;
	
	public static int DEFAULT_CAPACITY = 10;
	
	public CircularArrayQueue()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public CircularArrayQueue(int capacity)
	{
		this.arr = new int[capacity];
		this.cs = 0;
		this.ms = capacity;
		this.front = 0;
		//Initializing rear to capacity-1.
		this.rear = capacity - 1;
	}
	
	public boolean isFull()
	{
		boolean result = (this.cs==this.ms);
		return result;
	}
	
	public boolean isEmpty()
	{
		boolean result = (this.cs==0);
		return result;
	}
	
	public void enqueue(int data)
	{
		if(!this.isFull())
		{
			int n = this.arr.length;
			this.rear = (this.rear+1)%n;
			this.arr[this.rear] = data;
			this.cs++;
			System.out.println("Insereted: " + data);
		}
	}
	
	public int dequeue()
	{
		if(!this.isEmpty())
		{
			int element = this.arr[this.front];
			int n = this.arr.length;
			this.front = (this.front+1)%n;
			this.cs--;
			return element;
		}
		return -1;
	}
	
	public int getFront()
	{
		return this.arr[this.front];
	}
	
	public static void main(String[] args)
	{
		CircularArrayQueue queue = new CircularArrayQueue();
		
		for(int i=1; i<=10; i++)
		{
			queue.enqueue(i*10);
		}
		
	    //System.out.println(queue.dequeue());
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
	}

}
