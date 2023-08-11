package OOPs.Inheritance;

public class Client {

	public static void main(String[] args) {
		parent obj = new parent();
		
		child obj1 = new child();
		
		System.out.println(obj.d);
		System.out.println(obj.d1);
		obj.fun();
		obj.fun1();
		
		System.out.println(obj1.d);
		System.out.println(obj1.d2);
		
		
		System.out.println(((parent)obj1).d);

	}

}
