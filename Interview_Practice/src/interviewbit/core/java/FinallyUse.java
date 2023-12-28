package interviewbit.core.java;

public class FinallyUse {

	public static void main(String[] args) {
		try {
			int var = 5;
			int res = 5/0;
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0); //finally block won't be executing.
		}
		finally {
			System.out.println("Execution of finally block:"+ (5%2));
		}

	}

}
