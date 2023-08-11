package String;

public class StringPerformance {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		appendStringSB(100000);
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println();
			
		System.out.println("Time taken is: " + (end-start));
		
	}
	
	//Time Complexity = O(n2)
	public static void appendString(int n)
	{
		String s = "";
		
		for(int i = 1; i <= n; i++)
		{
			s = s + i;
		}
	}
	
	
	//Improved Performance through StringBuilder
	public static void appendStringSB(int n)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++)
		{
			sb.append(i);
		}
	}

}
