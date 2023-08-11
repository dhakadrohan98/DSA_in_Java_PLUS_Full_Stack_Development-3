package Stack;

public class stackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		
		stackUsingArrays stack = new stackUsingArrays(5);
		
		for(int i=1; i<=5; i++)
		{
			stack.push(i * 10);
			stack.display();
		}
		
		// stack.push(60);
		System.out.println(stack.top());
		
		stack.pop();
		stack.display();
		System.out.println(stack.top());
		
	}

}
