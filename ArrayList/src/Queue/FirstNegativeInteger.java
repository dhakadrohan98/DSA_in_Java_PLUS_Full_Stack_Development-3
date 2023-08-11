package Queue;
import java.util.*;

public class FirstNegativeInteger {
	
	public static void printNegativeInteger(int arr[], int k)
	{
		LinkedList<Integer> queue = new LinkedList<>();
		int i;
		
		for(i=0; i<k; i++)
		{
			if(arr[i] < 0)
			{
				queue.addLast(i);		
			}
		}
		
		for( ;i < arr.length; i++)
		{
			//Printing negative element
			if(!queue.isEmpty())
			{
				System.out.print(arr[queue.peek()] + ", ");
			}
			else
			{
				System.out.print("0 ");
			}
			
			while(!queue.isEmpty() && queue.peek() <= i-k)
			{
				queue.removeFirst();
			}
			
			if(arr[i] < 0)
				queue.addLast(i);
		}
		
		//Repeating above conditions for last element
		if(!queue.isEmpty())
		{
			System.out.print(arr[queue.peek()] + ", ");
		}
		else
		{
			System.out.print("0 ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of window: ");
		int k = sc.nextInt();
		printNegativeInteger(arr, k);
		
	}

}
