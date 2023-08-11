package Queue;
import java.util.*;

public class MaxInWindowOfSize_K {
	
	public static void printMax(int[] arr, int k)
	{
		Deque<Integer> q = new LinkedList<>();
		int i;
		
		
		//Referring to 1st window of size K 
		for(i=0; i<k; i++)
		{
			while(!q.isEmpty() && arr[i] > arr[q.getLast()])
			{
				q.removeLast();
			}
			q.addLast(i);
		}
		
		//This loop work for remaining windows of size K
		for( ;i < arr.length; i++)
		{
			// Answer from previous window
			System.out.print(arr[q.getFirst()] + ", ");
			
			while(!q.isEmpty() && q.getFirst() <= i-k)
			{
				q.removeFirst();
			}
			
			while(!q.isEmpty() && arr[i] > arr[q.getLast()])
			{
				q.removeLast();
			}
			q.addLast(i);
		}
		// Print the last index from dequeue
		System.out.print(arr[q.getFirst()]);
	}
	
// Main Method
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = s.nextInt();
		}
		
		int k = s.nextInt();
		printMax(arr, k);

	}

}
