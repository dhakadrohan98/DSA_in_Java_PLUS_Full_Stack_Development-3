package Queue;

public class QUS_DequeueEfficient {
	
	DynamicStack primary;
	DynamicStack secondary;
	
	public QUS_DequeueEfficient() throws Exception
	{
		//Creating objects of DynamicStack
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	
	public boolean isEmpty()
	{
		return this.primary.isEmpty();
	}
	
	public int size()
	{
		return this.primary.size();
	}
	
	public void enqueue(int data) throws Exception
	{
		while(primary.size() != 0)
		{
			secondary.push(primary.pop());
		}
		primary.push(data);
		while(secondary.size() != 0)
		{
			primary.push(secondary.pop());
		}
		
	}
	
	public int dequeue() throws Exception
	{
		return this.primary.pop();
	}
	
	public int front() throws Exception
	{
		return this.primary.top();
	}
	
	public void display()
	{
		this.primary.display();
	}

}
