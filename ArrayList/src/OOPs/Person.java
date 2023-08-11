package OOPs;

public class Person {

	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("Constructor with no parameter");
	}
	
	public Person(int age)
	{
		System.out.println("Parameterized Constructor with one parameter");
		this.age = age;
	}
	
	public Person(String name, int age)
	{
		System.out.println("Parameterized Constructor with two parameter");
		this.name = name;
		this.age = age; 
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
