package Stack;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
        stackUsingArrays stack = new DynamicStack(5);
		
		for(int i=1; i<=5; i++)
		{
			stack.push(i * 10);
			stack.display();
		}
		
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		stack.push(110);
		//System.out.println(stack.top());
		
		stack.display();
		System.out.println(stack.top());
		
		// Print the length of new arr(data).
		System.out.println(stack.data.length);
		

	}

}
