package org.queueusingarrays;
public class QueueUsingArrays {
	
	int size = 5;
	int item[] = new int[size];
	int front,rear;
	
	public QueueUsingArrays()
	{
		front = -1;
		rear = -1;
	}
	
	public boolean isFull()
	{
		if(front == 0 && rear == size-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
    public void enQueue(int element)
    {
    	if(isFull())
    	{
    		System.out.println("Queue is full");
    	}
    	else 
    	{
    		if(front == -1)
    		    front = 0;
    		
    		rear++;
    		item[rear] = element;
    		System.out.println("Inserted: " + element);
    	}
    }
    
    public int deQueue()
    {
    	int element;
    	
    	if(isEmpty())
    	{
    		System.out.println("Queue is Empty");
    		return -1;
    	}
    	
    	else
    	{
    		element = item[front];
    		// If queque has only one element, So Reset the queue after deleting it.
    		
    		if(front >= rear)
    		{
    			front = -1;
    			rear = -1;
    		}
    		
    		else
    			front++;
    		
    		System.out.println("Deleted: " + element);
    		return element;
    	}
    }
    
    public void display()
    {
    	if(isEmpty())
    	{
    		System.out.println("Queue is Empty");
    	}
    	
    	else
    	{
    		System.out.println("\nFront index: " + front);
        	System.out.println("Items--> ");
        	
        	for(int i=front; i<=rear; i++)
        	{
        		System.out.print(item[i] + ", ");
        	}
        	
        	System.out.println("\nRear Index: " + rear);
    	}
    
    }

}
