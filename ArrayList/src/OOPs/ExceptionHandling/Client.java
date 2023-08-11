package OOPs.ExceptionHandling;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println("Hello");
		try
		{
			s1.setAge(-5);
			System.out.println("After Statement");
		}
		
		catch(Exception e)
		{
			System.out.println("In Catch Block");
		}
		System.out.println("Bye");
		System.out.println(s1.getAge());
		
	}
}
