package singletonPattern;

public class Main {

	public static void main(String[] args) {
		Database db=null;
		
		Database object1 = db.getInstance();
		System.out.println(object1);
		
		object1.getConnection();	
		Database object2 = db.getInstance();
		System.out.println(object2);
		
		if(object1.hashCode() == object2.hashCode()) {
			System.err.println("true");
		}
		object1.getConnection();
		
	}
}
