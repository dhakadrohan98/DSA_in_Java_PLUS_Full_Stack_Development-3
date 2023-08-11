package OOPs.Overloading;

public class FxnOverloading {

	public static void main(String[] args) {
		System.out.println(Sum(2,3));
		System.out.println(Sum(2,3,5));
		
		System.out.println(Sum(2.5,3));
		System.out.println(Sum(2.5,"Hello"));
		
		System.out.println(Sum("Hello", 2,3,4,5,6,7,8));

	}
	
	public static int Sum(String str, int... args)
	{
		int sum = 0;
		
		for(int val: args)
		{
			sum += val;
		}
		return sum;
	}
	
	public static String Sum(double a, String b)
	{
		return a+b;
	}
	
	public static int Sum(int a, int b)
	{
		return a+b;
	}
	
	public static int Sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static double Sum(double a, double b)
	{
		return a+b;
	}

}
