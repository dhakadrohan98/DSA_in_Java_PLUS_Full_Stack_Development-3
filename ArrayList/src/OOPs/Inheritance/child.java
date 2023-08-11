package OOPs.Inheritance;

public class child extends parent {

	int d = 20;
	int d2 = 200;
	
	@Override
	public void fun()
	{
		System.out.println("In C Fun");
		System.out.println("Fun method is overridden");
	}
	
	public void fun2()
	{
		System.out.println("In C Fun2");
	}
}
