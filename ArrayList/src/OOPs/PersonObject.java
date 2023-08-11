package OOPs;

public class PersonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person(20);
		Person p3 = new Person("Solanki",55);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		p1.setAge(10);
		p1.setName("Aarush");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
   
	}

}
