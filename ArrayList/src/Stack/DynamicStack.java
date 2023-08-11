package Stack;

public class DynamicStack extends stackUsingArrays {

	public DynamicStack() throws Exception
	{
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicStack(int capacity) throws Exception
	{
		// Calling parent class parameterized constructor--> stackUsingArrays(int capacity)
		super(capacity);
	}
	
	public void push(int item) throws Exception
	{
		if(this.size() == this.data.length)
		{
			// Creating Array of double size of previous size
			int[] arr = new int[2 * this.data.length];
			// Copying all elements in new arr
			for(int i = 0; i < this.size(); i++)
			{
				arr[i] = this.data[i];
			}
			// Changing reference of data to new arr.
			this.data = arr;
		}
		
//      push new elements in arr, code is given below in two lines
//		this.top++;
//		this.data[this.top] = item;
		
		super.push(item);
	}
	
//	public int size()
//	{
//		return this.data.length;
//	}
}
