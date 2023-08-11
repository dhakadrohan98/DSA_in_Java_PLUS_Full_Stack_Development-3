package Stack;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		
		stackUsingArrays stack = new stackUsingArrays(5);
		
		for(int i=1; i<=5; i++)
		{
			stack.push(i * 10);
		}
		
		stack.display();
		
		stackUsingArrays helper = new stackUsingArrays(5);
		reverseStack(stack, helper, 0);
        stack.display();

	}
	
	public static void reverseStack(stackUsingArrays stack, stackUsingArrays helper, int index) throws Exception
	{
		if(stack.isEmpty())
		{
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		
		if(index == 0)
		{
			while(!helper.isEmpty())
			{
				stack.push(helper.pop());
			}
		}
	}

}
