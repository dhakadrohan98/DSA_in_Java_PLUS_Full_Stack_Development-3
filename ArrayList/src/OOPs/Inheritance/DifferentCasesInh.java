package OOPs.Inheritance;

public class DifferentCasesInh {

	public static void main(String[] args) {
		
		System.out.println("----- Case 1-----");
		parent obj1 = new parent();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		System.out.println("----- Case 2-----");
		parent obj2 = new child();
		System.out.println(obj2.d);
		System.out.println(((child)obj2).d); // Access d of child class due to typecasting
		System.out.println(obj2.d1);
		System.out.println(((child)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((child)obj2).fun2();
		
		System.out.println("----- Case 3-----");
//		child obj3 = new parent();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d1);
//		System.out.println(obj3.d2);
		
		System.out.println("----- Case 4-----");
		child obj4 = new child();
		System.out.println(obj4.d);
		System.out.println(((parent)obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		
		obj4.fun();
		((parent)obj4).fun(); // Parent's fun() will not call here, child fun() will be called due to { new child(); }
		
		obj4.fun1();
		obj4.fun2();
		
	}

}
