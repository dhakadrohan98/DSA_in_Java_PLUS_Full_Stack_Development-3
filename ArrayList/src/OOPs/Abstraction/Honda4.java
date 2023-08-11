package OOPs.Abstraction;

public class Honda4 extends Bike {
	
	void run()
	{
		System.out.println("Running Safely");
	}

	public static void main(String[] args) {
		Bike obj = new Honda4();
		
		obj.run();
		
	}

}
