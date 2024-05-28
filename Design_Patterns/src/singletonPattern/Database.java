package singletonPattern;

//Lazy Instantiation: 
public class Database {
	
//	Create a private attribute of the class type that refers to the single object.
	private static Database dbObject = null;
	
// Create a private constructor of the class to restrict object creation outside of the class
	private Database() {
		
	}
    //Create a public static method that allows us to create and access the object we created. 
	//Inside the method, we will create a condition that restricts us from creating more than one object.
	public static Database getInstance() {
		if(dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}
	
	public void getConnection() {
		System.out.println("you are now connected to the database");
	}
	
	@Override
	public String toString() {
		return "Database [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
